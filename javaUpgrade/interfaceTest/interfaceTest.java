package javaUpgrade.interfaceTest;

/**
 * @program: Testcode
 * @description: 函数式接口的练习
 * @author: Fuwen
 * @create: 2021-05-03 13:01
 **/
@FunctionalInterface
public interface interfaceTest<R,T> {
        R operator(T t1,T t2);
}
