package leetcodeTest;

import javafx.collections.transformation.SortedList;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Create by Fuwen on 2021/1/2
 * 239. 滑动窗口最大值
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回滑动窗口中的最大值。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
 * 输出：[3,3,5,5,6,7]
 * 解释：
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 示例 2：
 *
 * 输入：nums = [1], k = 1
 * 输出：[1]
 * 示例 3：
 *
 * 输入：nums = [1,-1], k = 1
 * 输出：[1,-1]
 * 示例 4：
 *
 * 输入：nums = [9,11], k = 2
 * 输出：[11]
 * 示例 5：
 *
 * 输入：nums = [4,-2], k = 2
 * 输出：[4]
 */
public class SlidingWindowMaximum {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int len = nums.length;
            if (len == 0 || len < k) {
                return new int[0];
            }
            int[] res = new int[len - k + 1];

            Deque<Integer> deque = new ArrayDeque<>(len - k + 1);
            for (int i = 0; i < len; i++) {
                // 判断队首元素是否移出滑动窗口
                if (i >= k && !deque.isEmpty() && deque.peekFirst() == i - k) {
                    deque.removeFirst();
                }

                // 依次判断待添加元素是否比队首元素大，注意可以取等号
                while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                    deque.removeLast();
                }

                // 加入队列的是下标
                deque.addLast(i);

                if (i >= k - 1) {
                    res[i - k + 1] = nums[deque.peekFirst()];
                }
            }
            return res;
        }



    public static void main(String[] args) {
        for (int i :
                new SlidingWindowMaximum().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)) {
            System.out.println(i);
        }
    }
    }

