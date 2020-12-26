为spring中注册bean有多少种方式

xml

<bean id =""  class="">

java config

@Bean

Person person(){

return Person();

}

@ComponentScanner+@Component @Service @Repository

![](为什么不能扫描接口.PNG)

第三方框架整合

@Import

BeanDefinationRegisterPostProcessor

