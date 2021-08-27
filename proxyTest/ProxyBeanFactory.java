package proxyTest;

/**
 * @program: Testcode
 * @description: 代理工厂类
 * @author: Fuwen
 * @create: 2021-06-12 23:03
 **/
public class ProxyBeanFactory {
    public static <T> T getBean(T obj,Interceptor interceptor){
        return (T) ProxyBeanUtil.getBean(obj,interceptor);
    }
}
