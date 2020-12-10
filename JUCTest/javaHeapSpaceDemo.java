package JUCTest;

import java.util.Random;

public class javaHeapSpaceDemo {
    public static void main(String[] args) {
        String str="黑色魔术女人";

        while (true){
            str+=str+new Random().nextInt(111111111)+new Random().nextInt(2222);
            str.intern();
        }
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
