public class Meeting {
    public static void main2(String[] args) {
        for(byte b=127;b++<130;){
            System.out.print(b);
        }
    }


    public static void main1(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                pong();
            }
        };
        thread.run();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }

    public static void main3(String[] args) {
        int a = 1;int b = 1; int c = 1;int d =1;
        System.out.println((a++>b)&(a++>b));
        System.out.println(a);
        System.out.println((c++>b)&&(c++>b));
        System.out.println(c);
        System.out.println((++d>b)&&(++d>b));
    }
public static void print(String str){
    System.out.print(str+=str);
}
public static void print1(StringBuffer stringBuffer){

}
    public static void main(String[] args) {
        StringBuffer b=new StringBuffer("b");
        String str="a";
        String c="12345";
        System.out.println("c是"+c);
        System.out.println(c.substring(1,3));
        System.out.println(c.split("").length);
        print(str);
        System.out.print(str);
    }
}
