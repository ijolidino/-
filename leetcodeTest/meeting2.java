public class meeting2 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            if (i%3>1){
                continue;
            }
            System.out.print(i+"");

            if (++i>5){
                break;
            }
            if (i==2){
                return;
            }
        }
        System.out.println();
        System.out.println(1%3);
        System.out.println(2%3);
        System.out.println(3%3);
    }
}
