package leetcodeTest.Easy;

import java.util.Arrays;

/**
 * Create by Fuwen on 2021/1/9
 * 面试题 17.10. 主要元素
 * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 *
 * 示例 1：
 *
 * 输入：[1,2,5,9,5,9,5,5,5]
 * 输出：5
 *
 *
 * 示例 2：
 *
 * 输入：[3,2]
 * 输出：-1
 *
 *
 * 示例 3：
 *
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 */
public class FindMajorityElementLCCI {
    public int majorityElement(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int len=nums.length;
        int count=1;
        for (int i = 0; i <len-1 ; i++) {
            if (nums[i]==nums[i+1]){
                count++;
                if (count>len/2){
                    return nums[i];
                }
            }else if (nums[i]!=nums[i+1]){
                count=1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FindMajorityElementLCCI().majorityElement(new int[]{1}));
        //System.out.println(7/2);
    }
}
