import java.util.Date;

public class BublleSort {
    public static void main(String[] args) {
        int[] arr=new int[1000000];
        Date date = new Date();
        for (int i=0;i<arr.length-1;i++){
            arr[i]=(int)(Math.random()*1000000);
        }
        System.out.println(date);
        for (int i=0;i<=arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    int tm=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tm;
                }
            }
        }
        System.out.println(date);
//        System.out.print("排序后：");
//        for (int tmp:arr){
//            System.out.print(tmp);
//        }
    }
}
