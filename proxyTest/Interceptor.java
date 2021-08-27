package proxyTest;

/**
 * @program: Testcode
 * @description: 拦截器
 * @author: Fuwen
 * @create: 2021-06-12 20:03
 **/
public interface Interceptor {

     void before(Object obj);

     void after(Object obj);

     void afterRunning(Object obj);

     void afterThrowing(Object obj);
}
