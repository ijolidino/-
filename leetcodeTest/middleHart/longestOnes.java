package leetcodeTest.middleHart;

/**
 * Create by Fuwen on 2021/2/3
 * 最大连续 1 的个数 III
 * 给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。
 *
 * 返回仅包含 1 的最长（连续）子数组的长度。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * 输出：6
 * 解释：
 * [1,1,1,0,0,1,1,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 6。
 * 示例 2：
 *
 * 输入：A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
 * 输出：10
 * 解释：
 * [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 10。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/algorithm-and-interview-skills/xqr8m5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class longestOnes {
    public int longestOnes(int[] A, int K) {
        if(A==null||A.length<=0) return 0;
        int left=0;
        int zero=0;
        int max=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]==0){
                zero++;
            }
            while (zero>K){
                if (A[left]==0){
                    left++;
                    zero--;
                }else {
                    left++;
                }
            }
            max=Math.max(max,i-left+1);

        }
        return max;
    }
}
