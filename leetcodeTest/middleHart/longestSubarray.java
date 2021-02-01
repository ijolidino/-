package leetcodeTest.middleHart;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Create by Fuwen on 2021/2/1
 * 1438. 绝对差不超过限制的最长连续子数组
 * 给你一个整数数组 nums ，和一个表示限制的整数 limit，请你返回最长连续子数组的长度，该子数组中的任意两个元素之间的绝对差必须小于或者等于 limit 。
 *
 * 如果不存在满足条件的子数组，则返回 0 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [8,2,4,7], limit = 4
 * 输出：2
 * 解释：所有子数组如下：
 * [8] 最大绝对差 |8-8| = 0 <= 4.
 * [8,2] 最大绝对差 |8-2| = 6 > 4.
 * [8,2,4] 最大绝对差 |8-2| = 6 > 4.
 * [8,2,4,7] 最大绝对差 |8-2| = 6 > 4.
 * [2] 最大绝对差 |2-2| = 0 <= 4.
 * [2,4] 最大绝对差 |2-4| = 2 <= 4.
 * [2,4,7] 最大绝对差 |2-7| = 5 > 4.
 * [4] 最大绝对差 |4-4| = 0 <= 4.
 * [4,7] 最大绝对差 |4-7| = 3 <= 4.
 * [7] 最大绝对差 |7-7| = 0 <= 4.
 * 因此，满足题意的最长子数组的长度为 2 。
 * 示例 2：
 *
 * 输入：nums = [10,1,2,4,7,2], limit = 5
 * 输出：4
 * 解释：满足题意的最长子数组是 [2,4,7,2]，其最大绝对差 |2-7| = 5 <= 5 。
 * 示例 3：
 *
 * 输入：nums = [4,2,2,2,4,4,2,2], limit = 0
 * 输出：3
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 10^5
 * 1 <= nums[i] <= 10^9
 * 0 <= limit <= 10^9
 */
public class longestSubarray {
    public int longestSubarray(int[] nums, int limit) {
        //这里维护的是最大值们对应的下标
        Deque<Integer> maxQ=new LinkedList<>();
        Deque<Integer> minQ=new LinkedList<>();
        int ans=0;
        //窗口左沿
        int start=0;
        //窗口右沿
        for (int end=0; end<nums.length;end++){
            //右沿元素进入窗口、维护最大值单调队列
            while(!maxQ.isEmpty() && nums[maxQ.peekLast()]<nums[end]){
                maxQ.pollLast();
            }
            maxQ.add(end);
            //右沿元素进入窗口、维护最小值单调队列
            while(!minQ.isEmpty() && nums[minQ.peekLast()]>nums[end]){
                minQ.pollLast();
            }
            minQ.add(end);

            //如果当前窗口的最大值最小值的差大于 limit，则不断缩小窗口（左沿++），直至最大值变小或者最小值变大从而满足 limit 限制
            while(!maxQ.isEmpty() && !minQ.isEmpty() && nums[maxQ.peek()]-nums[minQ.peek()]>limit){
                if(maxQ.peek()<=start) maxQ.poll();
                if(minQ.peek()<=start) minQ.poll();
                start++;
            }
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new longestSubarray().longestSubarray(new int[]{1,5,6,7,8,10,6,5,6},4));
    }
}
