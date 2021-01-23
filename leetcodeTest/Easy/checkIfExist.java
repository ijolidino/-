package leetcodeTest.Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create by Fuwen on 2021/1/23
 * 1346. 检查整数及其两倍数是否存在
 * 给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。
 *
 * 更正式地，检查是否存在两个下标 i 和 j 满足：
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * 示例 1：
 *
 * 输入：arr = [10,2,5,3]
 * 输出：true
 * 解释：N = 10 是 M = 5 的两倍，即 10 = 2 * 5 。
 * 示例 2：
 *
 * 输入：arr = [7,1,14,11]
 * 输出：true
 * 解释：N = 14 是 M = 7 的两倍，即 14 = 2 * 7 。
 * 示例 3：
 *
 * 输入：arr = [3,1,7,11]
 * 输出：false
 * 解释：在该情况下不存在 N 和 M 满足 N = 2 * M 。
 */
public class checkIfExist {
    public boolean checkIfExist(int[] arr) {
        int j=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
             j=i+1;
            while (j<arr.length&&Math.abs(arr[j])<=Math.abs(2*arr[i])){
                if (Math.abs(arr[j])==Math.abs(2*arr[i])){
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new checkIfExist().checkIfExist(new int[]{10,2,5,3});
    }
}
