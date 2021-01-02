package leetcodeTest;

import javafx.collections.transformation.SortedList;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

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
        int l=nums.length;
        Vector<Integer> vector = new Vector<>();
        int[] ints = new int[nums.length-k+1];
        int a=0;
        for (int i = 0; i <l-k+1; i++) {
            a=i;
            for (int j = 0; j < k; j++) {
                vector.add(nums[a]);
                a+=1;
            }
            Collections.sort(vector);
            ints[i]=vector.get(k-1);
            vector.removeAll(vector);
            }
        return ints;
        }

    public static void main(String[] args) {
        for (int i :
                new SlidingWindowMaximum().maxSlidingWindow(new int[]{-3,1,2},3)) {
            System.out.println(i);
        }
    }
    }

