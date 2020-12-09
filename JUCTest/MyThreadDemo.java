package JUCTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThreadDemo {
    public static void main(String[] args) {
        ExecutorService pool=Executors.newFixedThreadPool(5);
        //模拟10个用户来办理业务，每个用户就是一个来自外部请求线程
        try{
            for (int i=0;i<=10;i++){
                pool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\tput request");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            pool.shutdown();
        }

    }
}
