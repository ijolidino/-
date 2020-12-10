package ErrorAndException;
import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
public class MetaspaceOOMTest {
    static class OOMTest{}

    public static void main(String[] args) {
        int i=0;//模拟计数多少次后发生异常
        try {
            while (true){
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor(){
                    @Override
                    public Object intercept(Object o,Method method,Object[] objects,MethodProxy methodProxy)throws Throwable{
                        return methodProxy.invokeSuper(o,args);
                    }

                });
            }
        } catch (Exception e) {
            System.out.println("*********************多少次后发生了异常"+i);
            e.printStackTrace();
        }
    }
}
