package leetcodeTest.middleHart;

/**
 * @program: Testcode
 * @description: 三的次数倍
 * @author: Fuwen
 * @create: 2021-03-06 23:20
 * 5681. 判断一个数字是否可以表示成三的幂的和
 * 给你一个整数 n ，如果你可以将 n 表示成若干个不同的三的幂之和，请你返回 true ，否则请返回 false 。
 *
 * 对于一个整数 y ，如果存在整数 x 满足 y == 3x ，我们称这个整数 y 是三的幂。
 **/
public class checkPowersOfThreeLeeCode {
    public boolean checkPowersOfThree(int n) {
        if (n<1){
            return false;
        }
        if (n==1){
            return true;
        }
        if (n%3==0){
            n=n/3;
        }else if ((n-1)%3==0){
            n=(n-1)/3;
        }else {
            return false;
        }
        return checkPowersOfThree(n);
    }

    public static void main(String[] args) {
        System.out.println(new checkPowersOfThreeLeeCode().checkPowersOfThree(14));
    }
}
