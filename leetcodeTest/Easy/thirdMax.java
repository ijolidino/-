package leetcodeTest.Easy;

import java.util.Arrays;

/**
 * Create by Fuwen on 2021/1/26
 * 414. 第三大的数
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 *
 *
 *
 * 示例 1：
 *
 * 输入：[3, 2, 1]
 * 输出：1
 * 解释：第三大的数是 1 。
 * 示例 2：
 *
 * 输入：[1, 2]
 * 输出：2
 * 解释：第三大的数不存在, 所以返回最大的数 2 。
 * 示例 3：
 *
 * 输入：[2, 2, 3, 1]
 * 输出：1
 * 解释：注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */
public class thirdMax {
    public int thirdMax(int[] nums) {
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }else if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int a=3;
        for (int i = nums.length-1; i >0 ; i--) {
            if (nums[i]>nums[i-1]){
               a--;
            }
            if (a==1){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new thirdMax().thirdMax(new int[]{9,8,3,2,1}));
    }
}
