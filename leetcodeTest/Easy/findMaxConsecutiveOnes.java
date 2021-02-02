package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/2/2
 * 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 *
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/cd71t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, tmp = 0;
        for (int num : nums) {
            if (num == 1) {
                tmp++;
            } else if (tmp > count) {
                count = tmp;
                tmp = 0;
            } else {
                tmp = 0;
            }
        }
        if (tmp > count) {
            count = tmp;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new findMaxConsecutiveOnes().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
