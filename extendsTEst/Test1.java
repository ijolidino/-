package extendsTEst;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Test1 {
    public static int getValue(int i){
//        AtomicInteger atomicInteger = new AtomicInteger();
        int result =0;
        switch (i){
            case 1:
                result=result+1;
            case 2:
                result=result+i*2;
            case 3:
                result=result+i*3;
            case 4:
                result=result+i*3;
        }
        return result;
    }
    public static StringBuffer change(StringBuffer s){
        s=new StringBuffer("3");
        return s;
    }
    public static void main(String[] args) {
//        Programmer programmer = new Programmer(1);
//        programmer.fun1();
// ----------------------------------------
//            int a=5;
//            System.out.println((a<4)?4.4:4);
//            ArrayList arrayList = new ArrayList(20);
//-------------------------------------------------
//        System.out.println(getValue(2));
//------------------------------------------------------
//        /*
//         * Output:
//         *  Human fun1
//         *  Programmer's fun2
//         */------------------------------------------------------------------
//        System.out.println(1);
//        Thread thread = new Thread(){
//            public void run(){
//                pong();
//            }
//        };
//        thread.run();
//        System.out.println("ping");
String a="1";
        StringBuffer b = new StringBuffer("2");

//        change(a);
change(b);
        System.out.println(a);
        System.out.println(b);
    }
    static void pong(){
        System.out.println("pong");
    }
}
