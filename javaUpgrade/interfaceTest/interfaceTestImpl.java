package javaUpgrade.interfaceTest;

/**
 * @program: Testcode
 * @description: 函数式接口的实现
 * @author: Fuwen
 * @create: 2021-05-03 13:03
 **/
public class interfaceTestImpl {

    public static Integer operator(Integer x,Integer y,interfaceTest<Integer,Integer> of){
        return of.operator(x,y);
    }

    public static void main(String[] args) {
        //第一中书写方式
        Integer o1=operator(20,5,(x,y)->{
            return x*y;
        });
        //第二种书写方式
        Integer o2=operator(20,5, Integer::sum);

        Integer o3=operator(20,5,(x,y)->x/y);

        System.out.println(o1+","+o2+","+o3);
    }
}
