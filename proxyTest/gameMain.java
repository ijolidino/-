package proxyTest;

/**
 * @program: Testcode
 * @description: 主程序
 * @author: Fuwen
 * @create: 2021-06-12 23:01
 **/
public class gameMain {
    public static void main(String[] args) {
        RoleService roleService=new RoleServiceImpl();
        Interceptor interceptor=new Roleinterceptor();
        RoleService bean = ProxyBeanFactory.getBean(roleService, interceptor);
        Role role = new Role();
        role.setName("谭富文");
        role.setAge(18);
        bean.printRole(role);
        role=null;
        System.out.println("make role=null!!!");
        bean.printRole(role);
    }
}
