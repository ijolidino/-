import java.util.Arrays;

public class test2 {
String[] a={"A","C","E","F","B","A","E","B","A","B"};
int count,secondCount=0;
String firstChar;
String secondChar;
static String aChar;
    public test2(){
        for (int j=0;j<a.length;j++){
            for (int i=0;i<a.length-1-j;i++){
                if (a[i].compareTo(a[i+1])>=0){
                    String string=a[i+1];
                    a[i+1]=a[i];
                    a[i]=string;
                }
            }
        }

        for (String s:a){
            System.out.print(s);
        }
//        Arrays.sort(a);
        System.out.println("Biggest:"+a[a.length-1]);

        for (int i=0;i<a.length;i++){
            firstChar=a[i];
            count=0;
            for (int k=0;k<a.length;k++){
                secondChar=a[k];
                if (firstChar.compareTo(secondChar)==0){
                    count++;
                }
            }
            if (secondCount<=count){
                secondCount=count;
                aChar=firstChar;
            }
        }
        System.out.println("出现次数:"+secondCount+"。字符为:"+aChar);
    }

    public static void main(String[] args) {
        new test2();
//        String c="c";
//        String d="d";
//        System.out.println(c.compareTo(d));
    }
}
