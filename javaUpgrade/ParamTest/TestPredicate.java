package javaUpgrade.ParamTest;

import java.util.function.BiFunction;

/**
 * @program: Testcode
 * @description:
 * @author: Fuwen
 * @create: 2021-05-03 12:33
 **/
public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p=x ->x<10;
        System.out.println(p.test(1));

        BiFunction<String,Integer,Apple> c3=Apple::new;
        

    }
}
