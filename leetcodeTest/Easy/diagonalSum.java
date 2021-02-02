package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/2/2
 * 1572. 矩阵对角线元素的和
 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
 *
 * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 *
 *
 *
 * 示例  1：
 *
 *
 *
 * 输入：mat = [[1,2,3],
 *             [4,5,6],
 *             [7,8,9]]
 * 输出：25
 * 解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
 * 请注意，元素 mat[1][1] = 5 只会被计算一次。
 * 示例  2：
 *
 * 输入：mat = [[1,1,1,1],
 *             [1,1,1,1],
 *             [1,1,1,1],
 *             [1,1,1,1]]
 * 输出：8
 * 示例 3：
 *
 * 输入：mat = [[5]]
 * 输出：5
 *
 *
 * 提示：
 *
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 */
public class diagonalSum {
    public int diagonalSum(int[][] mat) {
            int a=0;
            int b=mat.length-1;
            int c=mat[0].length-1;
            int j=0;
        for (int i = 0; i < (mat.length%2==0?mat.length/2:mat.length/2+1); i++) {
            if (a==b){
                j+=mat[a][a];
            }else {
                j+=mat[a][a]+mat[a][b]+mat[c][c]+mat[c][a];
            }
            a++;
            b--;
            c--;
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(new diagonalSum().diagonalSum(new int[][]{{5}}));
        System.out.println(3/2);
    }
}
