package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/1/15
 * 1539. 第 k 个缺失的正整数
 * 给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
 *
 * 请你找到这个数组里第 k 个缺失的正整数。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [2,3,4,7,11], k = 5
 * 输出：9
 * 解释：缺失的正整数包括 [1,5,6,8,9,10,12,13,...] 。第 5 个缺失的正整数为 9 。
 * 示例 2：
 *
 * 输入：arr = [1,2,3,4], k = 2
 * 输出：6
 * 解释：缺失的正整数包括 [5,6,7,...] 。第 2 个缺失的正整数为 6 。
 */
public class findKthPositive {
    public int findKthPositive(int[] arr, int k) {
            int a=k;
            int len=3001;
            int num=0;
            int j=0;
        for (int i = 1; i < len; i++) {
            if (j<arr.length&&arr[j]!=i){
                k--;
            }
            if (j==arr.length){
                k--;
            }
            if (j<arr.length&&arr[j]==i){
                j++;
            }
            if (k==0){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new findKthPositive().findKthPositive(new int[]{2,3,4,7,11},6));
    }
}
