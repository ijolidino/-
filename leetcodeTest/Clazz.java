package leetcodeTest;

/**
 * @program: Testcode
 * @description: 测试
 * @author: Fuwen
 * @create: 2021-03-17 16:47
 **/
public class Clazz {
    public static int a = 0;
    public int b = 0;

    public Clazz() {
        a++;
        b++;
    }

    public static void main(String[] args) {
        Clazz c1 = new Clazz();
        Clazz c2 = new Clazz();
        c2.a++;
        System.out.println(c1.a + "," + c1.b);
    }
}

