## 1、常用命令-进程类

## service（centos6）

注册在系统中的标准化程序

有方便统一的管理服务方式（常用的方法）

​	service 服务名 start / stop /restart / reload / status

查看服务的方法 /etc/init.d/服务名

查看chkconfig命令设置自动启动

![](E:\Test\Testcode\JavaSE\Linux常用命令\运行级别runlevel（centos6）.PNG)

​	查看chkconfig  --list|grep xxx

![](E:\Test\Testcode\JavaSE\Linux常用命令\chkconfig --list.PNG)

​	chkconfig  --level 5 服务名 on



# centos7

![](E:\Test\Testcode\JavaSE\Linux常用命令\常用命令centos7（与6区分）.PNG)