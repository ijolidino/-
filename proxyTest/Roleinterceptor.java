package proxyTest;

/**
 * @program: Testcode
 * @description: 拦截器实现类
 * @author: Fuwen
 * @create: 2021-06-12 20:06
 **/
public class Roleinterceptor implements Interceptor {
    @Override
    public void before(Object obj) {
        System . out . println("准备打印角色信息");
    }

    @Override
    public void after(Object obj) {
        System.out.println("已完成打印角色信息");
    }

    @Override
    public void afterRunning(Object obj) {
        System.out.println(" 刚刚完成打印功能， 一切正常 。");
    }

    @Override
    public void afterThrowing(Object obj) {
        System.out.println("打印功能执行异常了，查看一下角色对象为空了吗？");
    }
}
