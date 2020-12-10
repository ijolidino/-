package JUCTest;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
//        myHashmap();
        myWeakHashMap();
    }
    private static void myHashmap(){
        HashMap<Object, Object> map = new HashMap<>();
        Integer key = new Integer(1);
        String value="HashMap";

        map.put(key,map);
        System.out.println(map);//{1=(this Map)}
        System.out.println("--------------------------------------");
        key=null;
        System.gc();
        System.out.println(map);//{1=(this Map)}
    }
    private static void myWeakHashMap(){
        WeakHashMap<Object, Object> map = new WeakHashMap<>();
        Integer key1 = new Integer(1);
        String value="HashMap";

        map.put(key1,map);
        System.out.println(map);//{1=(this Map)}
        System.out.println("--------------------------------------");
        key1=null;
        System.gc();
        System.out.println(map);//{}
    }
}
