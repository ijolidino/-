public class errorTest {
    public static void main(String[] args) {
        try {
            int a=1;
            int b=0;
            System.out.println(a/b+"");
        } catch (Exception e) {
            System.out.println("E");
            return;
        }finally {
            System.out.println("f");
        }
    }
}
