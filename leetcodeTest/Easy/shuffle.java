package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/1/24
 * 1470. 重新排列数组
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,5,1,3,4,7], n = 3
 * 输出：[2,3,5,4,1,7]
 * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4,4,3,2,1], n = 4
 * 输出：[1,4,2,3,3,2,4,1]
 * 示例 3：
 *
 * 输入：nums = [1,1,2,2], n = 2
 * 输出：[1,2,1,2]
 */
public class shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] ints = new int[2 * n];
        int j=n;
        int i1=0;
        for (int i = 0; i < 2*n-1; i+=2) {
            ints[i]=nums[i1];
            ints[i+1]=nums[j];
            i1++;
            j++;
        }
        return ints;
    }

    public static void main(String[] args) {
        new shuffle().shuffle(new int[]{1,2,3,4,4,3,2,1},4);
    }
}
