package JUCTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class MyResource {
 private volatile boolean Flag=true;//默认开启。进行生产消费
    private AtomicInteger atomicInteger=new AtomicInteger();

    BlockingQueue<String> blockingQueue=null;
    public MyResource(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }

    public void myProd()throws Exception{
        String data=null;
        boolean reValue;
        while (Flag){
            data=atomicInteger.incrementAndGet()+"";
            reValue=blockingQueue.offer(data,2L, TimeUnit.SECONDS);
            if (reValue){
                System.out.println(Thread.currentThread().getName()+"\t插入队列"+data+"成功");
            }else {
                System.out.println(Thread.currentThread().getName()+"\t插入队列"+data+"失败");
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(Thread.currentThread().getName()+"\t表示Flag为false，生产动作停止");
    }
    public void myConsumer() throws Exception{
        String result=null;
        while (Flag){
            result=blockingQueue.poll(2L,TimeUnit.SECONDS);
            if (null==result||result.equalsIgnoreCase("")){
                Flag=false;
                System.out.println(Thread.currentThread().getName()+"\t超过2秒钟没有取到蛋糕，消费退出");

            }
            System.out.println(Thread.currentThread().getName()+"\t消费队列"+result+"成功");

        }
    }
    public void stop()throws Exception{
        Flag=false;
    }

    public static void main(String[] args) throws Exception {
        MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t生产线程启动");
            try {
                myResource.myProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Prod").start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t消费线程");
            try {
                myResource.myConsumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"myConsumer").start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myResource.stop();
        System.out.println("5s is coming and mainThread need to stop");
    }
}
/*
Prod	生产线程启动
myConsumer	消费线程
Prod	插入队列1成功
myConsumer	消费队列1成功
myConsumer	消费队列2成功
Prod	插入队列2成功
Prod	插入队列3成功
myConsumer	消费队列3成功
Prod	插入队列4成功
myConsumer	消费队列4成功
Prod	插入队列5成功
myConsumer	消费队列5成功
5s is coming and mainThread need to stop
Prod	表示Flag为false，生产动作停止
myConsumer	超过2秒钟没有取到蛋糕，消费退出
myConsumer	消费队列null成功
 */