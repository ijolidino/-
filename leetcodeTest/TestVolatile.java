public class TestVolatile {
    static volatile int a=0;
    public static void main(String[] args) throws InterruptedException {
for (int i=0;i<=100;i++){
    new Thread(() ->{
        for (int j=0;j<=30000;j++){
            a++;
        }
    }

    ).start();
}
Thread.sleep(1000);
        System.out.println(a);
    }
}
