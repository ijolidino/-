package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/1/7
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 *
 * 输入: 4
 * 输出: 2
 * 示例 2:
 *
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 *      由于返回类型是整数，小数部分将被舍去。
 *      由于 xx 平方根的整数部分 \textit{ans}ans 是满足 k^2 \leq xk
 * 2
 *  ≤x 的最大 kk 值，因此我们可以对 kk 进行二分查找，从而得到答案。
 *
 * 二分查找的下界为 00，上界可以粗略地设定为 xx。在二分查找的每一步中，我们只需要比较中间元素 \textit{mid}mid 的平方与 xx 的大小关系，并通过比较的结果调整上下界的范围。由于我们所有的运算都是整数运算，不会存在误差，因此在得到最终的答案 \textit{ans}ans 后，也就不需要再去尝试 \textit{ans} + 1ans+1 了。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class SqrtX {
    public int mySqrt(int x) {//二分法解决
        int l=0,j=x,k=-1;
        while (l<=j){
            int mid=1+(j-1)/2;
            if ((long)mid*mid<=x){
                k=mid;
                l=mid+1;
            }else {
                j=mid-1;
            }
        }
        return k;
    }
}
