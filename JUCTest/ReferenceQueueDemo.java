package JUCTest;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class ReferenceQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(o1, queue);
        System.out.println(o1);//java.lang.Object@1b6d3586
        System.out.println(weakReference.get());//java.lang.Object@1b6d3586
        System.out.println(queue.poll());//null
        System.out.println("------------------------");
        o1=null;
        System.gc();
        Thread.sleep(500);
        System.out.println(o1);//null
        System.out.println(weakReference.get());//null
        System.out.println(queue.poll());//java.lang.ref.WeakReference@4554617c
    }
}
