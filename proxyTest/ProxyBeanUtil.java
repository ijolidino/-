package proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: Testcode
 * @description: 代理对象
 * @author: Fuwen
 * @create: 2021-06-12 20:01
 **/
public class ProxyBeanUtil implements InvocationHandler {
    //被代理对象
    private Object obj;
    //拦截器
    private Interceptor interceptor=null;

    public static Object getBean(Object obj,Interceptor interceptor){
        //使用当前类，作为代理方法，此时作为被代理对象执行方法的时候，会进入当前类的invoke方法里面
        ProxyBeanUtil _this=new ProxyBeanUtil();
        //保存被代理对象
        _this.obj=obj;
        //保存拦截器
        _this.interceptor=interceptor;
        //生成代理对象并绑定代理方法
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),_this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retObj=null;
        //是否产生异常
        boolean exceptionFlag=false;
        //before方法
        interceptor.before(obj);
        try {
            //反射原有的方法
            retObj=method.invoke(obj,args);
        }catch (Exception e){
            exceptionFlag=true;
        }finally {
            interceptor.after(obj);
        }
        if (exceptionFlag){
            interceptor.afterThrowing(obj);
        }else {
            interceptor.afterRunning(obj);
        }
        return retObj;
    }
}
