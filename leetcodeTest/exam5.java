package leetcodeTest;

/**
 * Create by Fuwen on 2021/1/6
 */
public class exam5 {
    static int s;
    int i;
    int j;
    {
        int i=1;
        i++;
        j++;
        s++;
    }
    public void test(int j){
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        exam5 obj1 = new exam5();
        exam5 obj2 = new exam5();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i+","+obj1.j+","+obj1.s);
        System.out.println(obj2.i+","+obj2.j+","+obj2.s);
    }
}
