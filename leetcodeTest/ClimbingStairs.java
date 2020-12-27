package leetcodeTest;

/**
 * Create by Fuwen on 2020/12/27
 *70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<1){
            return 0;
        }
        if(n==1||n==2){
            return n;
        }
        int one=2;//初始化为走到第二级台阶的走法
        int two=1;//初始化为走到第一级台阶的走法
        int sum=0;
        //最后跨2步+最后跨1步的走法
        for(int i=3;i<=n;i++){
            sum = two + one;
            two=one;
            one=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(9));
    }
}
