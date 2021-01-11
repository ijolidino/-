package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/1/11
 * 219. 存在重复元素 II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len=nums.length;
        if (len==2){
            return nums[0]==nums[1];
        }
        for (int i = 0; i < len-1; i++) {
            for (int l = i+1; l < i+k+1&&l<len; l++) {
                if (nums[i]==nums[l]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1,1,0},1));
        System.out.println(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1,2,3,4,5,6,7,8,9,9},1));
    }
}
