package proxyTest;

/**
 * @program: Testcode
 * @description: 角色实现类
 * @author: Fuwen
 * @create: 2021-06-12 22:58
 **/
public class RoleServiceImpl implements RoleService{
    @Override
    public final void printRole(Role role) {
        System.out.println(role.getAge()+""+role.getName());
    }
}
