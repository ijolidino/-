package leetcodeTest.Easy;

import java.util.Arrays;

/**
 * Create by Fuwen on 2021/1/15
 * 747. 至少是其他数字两倍的最大数
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 *
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *
 * 如果是，则返回最大元素的索引，否则返回-1。
 *
 * 示例 1:
 *
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6是最大的整数, 对于数组中的其他整数,
 * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 *
 *
 * 示例 2:
 *
 * 输入: nums = [1, 2, 3, 4]
 * 输出: -1
 * 解释: 4没有超过3的两倍大, 所以我们返回 -1.
 */
public class dominantIndex {
    public int dominantIndex(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int a=0;
        int b=0;
        int a1=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>a){
                b=a;
                a=nums[i];
                a1=i;
            }
            if (nums[i]>b&&nums[i]<a){
                b=nums[i];
            }
        }

        return a>=b*2?a1:-1;
    }

    public static void main(String[] args) {
        System.out.println(new dominantIndex().dominantIndex(new int[]{3}));
    }
}
