import java.util.Scanner;

public class yellowBeam {
    public static void main(String[] args) {
        int[] ints = new int[50];
        int[] vers=new int[50];
        int a=0;
        int c=0;
        for (int i=0;i<50;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字");
            String x=sc.nextLine();
            c=Integer.parseInt(x);
            ints[i]=c;
            vers[i]=8-c;
            a+=8;
            if (a==96){
                vers[i+1]=4;
                break;
            }
        }
        System.out.print("电脑先出数字：");
        for (int x:ints) {
            System.out.print(x);
        }
        System.out.println("我出的数字");
        for (int x:vers
             ) {
            System.out.print(x);
        }
    }
}
