package leetcodeTest.Easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by Fuwen on 2021/1/24
 * 1200. 最小绝对差
 * 给你个整数数组 arr，其中每个元素都 不相同。
 *
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 *
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * 示例 3：
 *
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 */
public class minimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(arr);
        ArrayDeque<List> deque = new ArrayDeque<>();
        int num=arr[1]-arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (num>arr[i+1]-arr[i]){
                num=arr[i+1]-arr[i];
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(arr[i]);
                integers.add(arr[i+1]);
                while (!deque.isEmpty()){
                    deque.removeAll(deque);
                }
                deque.addLast(integers);
            }else if (num==arr[i+1]-arr[i]){
                ArrayList<Integer> integers = new ArrayList<>();
                integers.add(arr[i]);
                integers.add(arr[i+1]);
                deque.addLast(integers);
            }
        }
        while (!deque.isEmpty()){
            lists.add(deque.removeFirst());
        }

        return lists;
    }

    public static void main(String[] args) {
        new minimumAbsDifference().minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27});
    }
}
