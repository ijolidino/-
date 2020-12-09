import java.util.Arrays;

/*
统计所有小于非负整数 n 的质数的数量。

 

示例 1：

输入：n = 10
输出：4
解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
示例 2：

输入：n = 0
输出：0
示例 3：

输入：n = 1
输出：0
 

提示：

0 <= n <= 5 * 106

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/count-primes
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class countPrimes {
    //枚举法
//    public int countPrimes(int n) {
//        int a=0;
//        for (int i=2;i<n;i++){
//            a+=P(i)==false? 0:1;
//        }
//        return a;
//    }
//    public boolean P(int i){
//        for (int j=2;j*j<=i;++j){
//            while (i%j==0){
//                return false;
//            }
//        }
//        return true;
//    }

    public int countPrimes(int n){
        int[] ints = new int[n];
        Arrays.fill(ints,1);
        int count=0;
        for (int i=2;i<n;i++){
            if (ints[i]==1){
                count++;
            }
          if ((long)i*i<n){
              for (int j=i*i;j<n;j+=i){
                  ints[j]=0;
              }
          }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(new countPrimes().countPrimes(100));
    }
}
