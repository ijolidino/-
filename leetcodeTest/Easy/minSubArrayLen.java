package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/2/2
 * 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 *
 *  
 *
 * 示例：
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/c0w4r/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        boolean flag = true;
        int minOfLength=s;
        int sum=0;
        int left=0;
        for (int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while (sum>=s){
                flag = false;
                if (right-left+1<minOfLength){
                    minOfLength=right-left+1;
                }
                sum-=nums[left];
                left++;
            }
        }
        if (flag)return 0;
        return minOfLength;
    }
}
