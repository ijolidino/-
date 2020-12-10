package JUCTest;

import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    public static void softRef_Memory_Enough(){
        Object o = new Object();
        SoftReference<Object> reference = new SoftReference<>(o);
        o=null;
        try {
            byte[] bytes = new byte[100 * 1024 * 1024];

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            System.out.println(o);
            System.out.println("---------------");
            System.out.println(reference.get());
            System.out.println("---------------");
        }

    }

    public static void main(String[] args) {
        softRef_Memory_Enough();
    }
    /*
    内存够用的时候就保留，不够用就回收
    VM设置：-Xms5m -Xmx5m -Xss1024k -XX:MetaspaceSize=512m -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseSerialGC
    控制台输出：
    -XX:InitialHeapSize=5242880 -XX:MaxHeapSize=5242880 -XX:MetaspaceSize=536870912 -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:ThreadStackSize=1024 -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
[GC (Allocation Failure) [DefNew: 1659K->192K(1856K), 0.0021253 secs][Tenured: 428K->620K(4096K), 0.0034696 secs] 1659K->620K(5952K), [Metaspace: 3225K->3225K(1056768K)], 0.0056664 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[Full GC (Allocation Failure) [Tenured: 620K->601K(4096K), 0.0017181 secs] 620K->601K(5952K), [Metaspace: 3225K->3225K(1056768K)], 0.0017476 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
null
---------------
null
---------------
Heap
 def new generation   total 1856K, used 46K [0x00000000ffa00000, 0x00000000ffc00000, 0x00000000ffc00000)
  eden space 1664K,   2% used [0x00000000ffa00000, 0x00000000ffa0bac8, 0x00000000ffba0000)
  from space 192K,   0% used [0x00000000ffbd0000, 0x00000000ffbd0000, 0x00000000ffc00000)
  to   space 192K,   0% used [0x00000000ffba0000, 0x00000000ffba0000, 0x00000000ffbd0000)
 tenured generation   total 4096K, used 601K [0x00000000ffc00000, 0x0000000100000000, 0x0000000100000000)
   the space 4096K,  14% used [0x00000000ffc00000, 0x00000000ffc96540, 0x00000000ffc96600, 0x0000000100000000)
 Metaspace       used 3257K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 353K, capacity 388K, committed 512K, reserved 1048576K
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at JUCTest.SoftReferenceDemo.softRef_Memory_Enough(SoftReferenceDemo.java:14)
	at JUCTest.SoftReferenceDemo.main(SoftReferenceDemo.java:29)


     */
}
