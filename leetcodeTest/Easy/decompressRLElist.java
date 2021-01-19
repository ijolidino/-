package leetcodeTest.Easy;

import java.util.ArrayDeque;

/**
 * Create by Fuwen on 2021/1/19
 * 1313. 解压缩编码列表
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 *
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 *
 * 请你返回解压后的列表。
 *
 *
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[2,4,4,4]
 * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
 * 示例 2：
 *
 * 输入：nums = [1,1,2,3]
 * 输出：[1,3,3]
 */
public class decompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int len=nums.length;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int j=1;
        for (int i = 0; i < len; i+=2) {
            int a=nums[i];
            int b=a*nums[j];
            while (b!=0){
                deque.addLast(nums[j]);
                b-=nums[j];
            }
            j+=2;
        }
        int s=deque.size();
        int[] ints = new int[deque.size()];
        for (int i = 0; i < s; i++) {
            if (!deque.isEmpty()){
                ints[i]=deque.pollFirst();
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        new decompressRLElist().decompressRLElist(new int[]{1,1,2,3});
    }
}
