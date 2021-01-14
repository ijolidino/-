package leetcodeTest;

import java.util.Arrays;

public class test {
    int[] a= {1,3,4,7,2,1,1,5,2};
    int firstNum,secondNum,count,secondCount=0;
    static int num;
    public test(){
        Arrays.sort(a);
        System.out.println("Biggest:"+a[a.length-1]);
        for(int i=0;i<a.length;i++){
            firstNum=a[i];
            count=0;
            for(int k=0;k<a.length;k++){
                secondNum=a[k];
                if(firstNum==secondNum){
                    count++;
                }
            }
            if(secondCount<=count){
                secondCount=count;
                num=firstNum;
            }
        }
        System.out.println("Count:"+secondCount+"/nnum:"+num);
    }
    public static void main(String[] args){
        //new test();
        int n=0111;
        String res = Integer.toBinaryString(n);
        System.out.println(res);
        System.out.println(Integer.parseInt("1001", 2));

        // 将字符串转换为数字进行打印，但不建议这么做，当为负数时，int型的表示不了32的一个整数，另外，int的位数有大小，打印的值超出范围就会报错
        int in = Integer.parseInt(res);
        System.out.print(in + "\n");
    }
}
