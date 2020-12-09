import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class quickSort {

    public static void main(String[] args) {
        int[] arr =new int[1000000];

        for (int i=0;i<= arr.length-1;i++){
            arr[i]=(int)(Math.random() * 1000000);
        }
        Date date = new Date();

        System.out.println("時間"+date);

        sort(arr, 0, arr.length-1);

        System.out.println("排序后時間"+date);
        System.out.println("打印如下");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[]arr,int left,int right){
        if (left>right){
            return;
        }
        int l,r,temp,base;
        base=arr[left];
        r=right;
        l=left;
        while (l<r){
            while (base>=arr[l]&&l<r){
                l++;
            }
            while (base<=arr[r]&&l<r){
                r--;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        arr[left]=arr[l];
        arr[l]=base;
        sort(arr,left,l-1);
        sort(arr,r+1,right);
    }
}
