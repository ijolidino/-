package leetcodeTest.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Create by Fuwen on 2021/1/28
 * 面试题 17.04. 消失的数字
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 *
 * 注意：本题相对书上原题稍作改动
 *
 * 示例 1：
 *
 * 输入：[3,0,1]
 * 输出：2
 *
 *
 * 示例 2：
 *
 * 输入：[9,6,4,2,3,5,7,0,1]
 * 输出：8
 */
public class missingNumber2 {

        public int missingNumber(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; ++i) {
                res ^= i;
                res ^= nums[i];
            }
            res ^= nums.length;

            return res;
        }

    public static void main(String[] args) {
        new missingNumber2().missingNumber(new int[]{1,7,8,9,4,3,5,6});
    }
}
