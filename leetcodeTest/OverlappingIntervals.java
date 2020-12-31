package leetcodeTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create by Fuwen on 2021/1/1
 * 435. 无重叠区间
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 *
 * 注意:
 *
 * 可以认为区间的终点总是大于它的起点。
 * 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 * 示例 1:
 *
 * 输入: [ [1,2], [2,3], [3,4], [1,3] ]
 *
 * 输出: 1
 *
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 * 示例 2:
 *
 * 输入: [ [1,2], [1,2], [1,2] ]
 *
 * 输出: 2
 *
 * 解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
 * 示例 3:
 *
 * 输入: [ [1,2], [2,3] ]
 *
 * 输出: 0
 *
 * 解释: 你不需要移除任何区间，因为它们已经是无重叠的了。
 */
public class OverlappingIntervals {

        public int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length == 0) {
                return 0;
            }

            Arrays.sort(intervals, new Comparator<int[]>() {
                public int compare(int[] interval1, int[] interval2) {
                    return interval1[0] - interval2[0];
                }
            });

            int n = intervals.length;
            int[] f = new int[n];
            Arrays.fill(f, 1);
            for (int i = 1; i < n; ++i) {
                for (int j = 0; j < i; ++j) {
                    if (intervals[j][1] <= intervals[i][0]) {
                        f[i] = Math.max(f[i], f[j] + 1);
                    }
                }
            }
            return n - Arrays.stream(f).max().getAsInt();
        }


    public static void main(String[] args) {
        int[][] ints = {{1, 2},{1, 2},{1, 2}, {2, 3}, {3, 4}, {1, 2}};

//        System.out.println(ints[1][0]);
        System.out.println(new OverlappingIntervals().eraseOverlapIntervals(ints));
    }
}
