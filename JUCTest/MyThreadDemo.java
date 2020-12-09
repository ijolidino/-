package JUCTest;

import java.util.concurrent.*;

public class MyThreadDemo {
    public static void main(String[] args) {
        //CPU核心数
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService poolExecutor;
        poolExecutor = new ThreadPoolExecutor(
                2,
                /*
                CPU密集型任务:该任务需要大量的运算，而没有阻塞，CPU一直全速运行
                CPU密集型任务只有真正的多喝CPU上才可能得到加速（通过多线程）
                            线程池数=CPU核数+1个线程的线程池
                IO密集型任务:该任务需要大量的IO，即大量的阻塞
                            在单线程上运行IO密集型的任务会导致浪费大量的CPU运算能力浪费在等待上。
                            所以在IO密集型的任务中使用多线程可以大大的加速程序运行，即使在单核CPU上，这种加速主要是利用了被浪费的阻塞时间
                            ①由于IO密集型的任务线程并不是一直在执行任务，则应配置尽可能多的线程，如CPU核数*2
                            ②CPU核心数/1-阻塞系数     阻塞系数在0.8~0.9之间
                            8核心：线程池数=8/1-0.9=80线程
                 */

                5,

                5L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        try{
            for (int i=0;i<=14;i++){
                poolExecutor.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"\tput request");

                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            poolExecutor.shutdown();
        }
    }
    public static void ThreadPoolInit() {
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
