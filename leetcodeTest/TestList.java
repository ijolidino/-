package leetcodeTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Create by Fuwen on 2020/12/16
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println("遍历修改前"+list.size());
        list.get(0);
        Iterator<String> iterator=list.iterator();
       // list.set(0,"2");无事
        //list.remove(0);ConcurrentModificationException
        while(iterator.hasNext()){
            String item=iterator.next();
            if(item=="1"){
                iterator.remove();
            }
            System.out.println(iterator.next());
        }
        System.out.println("遍历修改后"+list.size());
    }
}
