import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;
/*
假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对 (h, k) 表示，其中 h 是这个人的身高，k 是应该排在这个人前面且身高大于或等于 h 的人数。 例如：[5,2] 表示前面应该有 2 个身高大于等于 5 的人，而 [5,0] 表示前面不应该存在身高大于等于 5 的人。

编写一个算法，根据每个人的身高 h 重建这个队列，使之满足每个整数对 (h, k) 中对人数 k 的要求。

示例：

输入：[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
输出：[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 

提示：

总人数少于 1100 人。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/queue-reconstruction-by-height
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class queueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length==0||people[0].length==0){
            return new int[0][0];
        }
        //排序，如果首位排序，相等则拍第二个
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }else {
                    return o2[1]-o1[1];
                }

            }
        });
        //System.out.println(Arrays.deepToString(people));
        /*
        首位排序后，根据第二位数据插入新的二维数组中
         */
        int a=people.length;
        int [][] b=new int[a][];
        for (int[] per:people) {
            int spa=per[1]+1;
            for (int i=0;i<a;++i){
                if (b[i]==null){
                    --spa;
                    if (spa==0){
                        b[i]=per;
                        break;
                    }
                }
            }


        }
        return b;
    }

    public static void main(String[] args) {
        queueReconstructionByHeight queueReconstructionByHeight = new queueReconstructionByHeight();
        int[][] ints = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(Arrays.deepToString(queueReconstructionByHeight.reconstructQueue(ints)));

    }
}
