package JUCTest;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(3);//模拟三个停车位
        for (int i=1;i<=6;i++){//模拟六部汽车
            new Thread(()->{
                try {
                    s.acquire();
                    System.out.println(Thread.currentThread().getName()+"\t抢到车位");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println(Thread.currentThread().getName()+"\t停车三秒后离开");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    s.release();
                }
            },String.valueOf(i)).start();
        }
    }
}
