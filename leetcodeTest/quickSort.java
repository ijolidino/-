package leetcodeTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class quickSort {
//    public static void main(String[] args) {
//        int[] arr =new int[10];
//
//        for (int i=0;i<= arr.length-1;i++){
//            arr[i]=(int)(Math.random() * 1000000);
//        }
//        Date date = new Date();
//
//        System.out.println("時間"+date);
//
//        sort(arr, 0, arr.length-1);
//
//        System.out.println("排序后時間"+date);
//        System.out.println("打印如下");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//    static void sort(int[]arr,int left,int right){
//        if (left>right){
//            return;
//        }
//        int l,r,temp,base;
//        base=arr[left];
//        r=right;
//        l=left;
//        while (l<r){
//            while (base>=arr[l]&&l<r){
//                l++;
//            }
//            while (base<=arr[r]&&l<r){
//                r--;
//            }
//            temp=arr[l];
//            arr[l]=arr[r];
//            arr[r]=temp;
//        }
//        arr[left]=arr[l];
//        arr[l]=base;
//        sort(arr,left,l-1);
//        sort(arr,r+1,right);
//    }
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }
    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     * @param array
     * @param i
     * @param j
     */
    public static void swap( int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int [] arr=quickSort.QuickSort(new int[]{7,2,1,4,8,5,3,6,9,0},0,9);
        for (int i :
                arr) {
            System.out.print(i+",");
        }
    }
}
