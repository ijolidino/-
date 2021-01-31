package leetcodeTest.Easy;

import java.util.Arrays;

/**
 * Create by Fuwen on 2021/1/31
     * 1304. 和为零的N个唯一整数
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 *
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：[0]
 */
public class sumZero {
    public int[] sumZero(int n) {
        int[] ints = new int[n];
        if (n==1){
            ints[0]=0;
            return ints;
        }
        int j=n-1;
        if(n%2==0){
            int a=-n/2;
            int b=n/2;
            for (int i = 0; i < n / 2; i++) {
                ints[i]=a;
                ints[j]=b;
                a++;
                b--;
                j--;
            }
        }else {
            int a=-n/2;
            int b=n/2;
            ints[n/2+1]=0;
            for (int i = 0; i < n / 2; i++) {
                ints[i]=a;
                ints[j]=b;
                a++;
                b--;
                j--;
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new sumZero().sumZero(3)));
    }
}
