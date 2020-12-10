package ErrorAndException;

import java.util.ArrayList;

public class GCOverHeadDemo {
    //OutOfMemoryError
    public static void main(String[] args) {
        int i=0;
        ArrayList<Object> list = new ArrayList<>();
        try {
            while (true){
                list.add(String.valueOf(++i).intern());
            }
        } catch (Exception e) {
            System.out.println("i的值为---------------------------》"+i);
            e.printStackTrace();
        }
    }
}
