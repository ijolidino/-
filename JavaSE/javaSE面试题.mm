<map version="freeplane 1.8.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="javaSE面试题" FOLDED="false" ID="ID_1712305722" CREATED="1607783398914" MODIFIED="1607783439779" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle" zoom="1.61">
    <properties edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff" fit_to_viewport="false"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node" STYLE="oval" UNIFORM_SHAPE="true" VGAP_QUANTITY="24.0 pt">
<font SIZE="24"/>
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="default" ICON_SIZE="12.0 pt" COLOR="#000000" STYLE="fork">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.attributes">
<font SIZE="9"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.note" COLOR="#000000" BACKGROUND_COLOR="#ffffff" TEXT_ALIGN="LEFT"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000" STYLE="oval" SHAPE_HORIZONTAL_MARGIN="10.0 pt" SHAPE_VERTICAL_MARGIN="10.0 pt">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,5"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,6"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,7"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,8"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,9"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,10"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,11"/>
</stylenode>
</stylenode>
</map_styles>
</hook>
<hook NAME="AutomaticEdgeColor" COUNTER="5" RULE="ON_BRANCH_CREATION"/>
<node TEXT="Singleton" FOLDED="true" POSITION="right" ID="ID_1303462285" CREATED="1607783443818" MODIFIED="1607783460155">
<edge COLOR="#ff0000"/>
<node TEXT="Singleton:在Java中即指单例设计模式，他是软件开发中常用的设计模式之一。单例设计模式，即某个类在整个系统中只能有一个实例对象可以被获取和使用的代码模式。例如：代表JVM运行环境的Runtime类" ID="ID_764577200" CREATED="1607783465259" MODIFIED="1607783605710"/>
<node TEXT="要点" ID="ID_112973512" CREATED="1607783613664" MODIFIED="1607783620683">
<node TEXT="这个类只能有一个实例；" ID="ID_29274499" CREATED="1607783622466" MODIFIED="1607783642667">
<node TEXT="构造器私有化" ID="ID_1219277037" CREATED="1607783697301" MODIFIED="1607783707722"/>
</node>
<node TEXT="它必须自行创建这个实例" ID="ID_611259596" CREATED="1607783647432" MODIFIED="1607783659163">
<node TEXT="含有一个该类的静态变量来保存这个唯一的实例" ID="ID_1295896856" CREATED="1607783711284" MODIFIED="1607783735379"/>
</node>
<node TEXT="它必须自行向整个系统提供这个实例" ID="ID_132125977" CREATED="1607783661385" MODIFIED="1607783677450">
<node TEXT="对外提供获取该实例对象的方式：" ID="ID_46551253" CREATED="1607783737243" MODIFIED="1607783769123">
<node TEXT="直接暴露" ID="ID_13419382" CREATED="1607783770993" MODIFIED="1607783778003"/>
<node TEXT="用静态变量的get方法获取" ID="ID_1243942317" CREATED="1607783778864" MODIFIED="1607783789404"/>
</node>
</node>
</node>
<node TEXT="几种常见的形式：" ID="ID_1550527840" CREATED="1607783834113" MODIFIED="1607783845676">
<node TEXT="饿汉式：直接创建对象，不存在线程安全问题" ID="ID_1806992273" CREATED="1607783848084" MODIFIED="1607783900468">
<node TEXT="直接实例化饿汉式（简洁直观）" ID="ID_1111504302" CREATED="1607783915429" MODIFIED="1607783930987">
<node TEXT="" ID="ID_585739418" CREATED="1607784388540" MODIFIED="1607784410907">
<hook URI="饿汉式单例1.PNG" SIZE="0.8185956" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="枚举式（最简洁）" FOLDED="true" ID="ID_1852201774" CREATED="1607783931400" MODIFIED="1607783952827">
<node TEXT="" ID="ID_1557958345" CREATED="1607784666313" MODIFIED="1607784672617">
<hook URI="单例模式枚举类.PNG" SIZE="0.96463025" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="静态代码块饿汉式（最适合复杂实例化）" ID="ID_1811634023" CREATED="1607783953353" MODIFIED="1607783970531">
<node TEXT="" ID="ID_38976029" CREATED="1607785014770" MODIFIED="1607785415301">
<hook URI="静态方式创建单例模式.PNG" SIZE="0.31965902" NAME="ExternalObject"/>
</node>
</node>
</node>
<node TEXT="懒汉式：延迟创建对象" ID="ID_1480417093" CREATED="1607783902977" MODIFIED="1607783913242">
<node TEXT="线程不安全（适合单线程）" ID="ID_1569188827" CREATED="1607783974691" MODIFIED="1607783987235">
<node TEXT="" ID="ID_1289271977" CREATED="1607785793224" MODIFIED="1607785799665">
<hook URI="懒汉单例模式1.PNG" SIZE="0.60851926" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="线程安全（适合多线程）" ID="ID_1332367427" CREATED="1607783987657" MODIFIED="1607783997339">
<node TEXT="" ID="ID_627196804" CREATED="1607786116183" MODIFIED="1607786122824">
<hook URI="Synchronized版懒汉单例模式.PNG" SIZE="0.47885075" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="静态内部类（适合多线程）" ID="ID_640600330" CREATED="1607783997681" MODIFIED="1607784012715">
<node TEXT="" ID="ID_1168718825" CREATED="1607786535115" MODIFIED="1607786585056">
<hook URI="单例模式懒汉式静态内部类加载.PNG" SIZE="0.42857143" NAME="ExternalObject"/>
</node>
</node>
</node>
</node>
</node>
<node TEXT="类初始化和实例初始化" POSITION="right" ID="ID_1186095330" CREATED="1607787075798" MODIFIED="1607787097274">
<edge COLOR="#ff00ff"/>
<node TEXT="" ID="ID_1186346496" CREATED="1607787105235" MODIFIED="1607787114134">
<hook URI="类加载及其初始化面试题.PNG" SIZE="0.27039206" NAME="ExternalObject"/>
<node TEXT="" ID="ID_238603035" CREATED="1607787105409" MODIFIED="1607789172683">
<hook URI="类加载及其初始化执行顺序.PNG" SIZE="0.6880734" NAME="ExternalObject"/>
</node>
<node TEXT="" ID="ID_810165833" CREATED="1607789204975" MODIFIED="1607789213393">
<hook URI="类加载及其初始化面试题答案.PNG" SIZE="1.0" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="类初始化过程" FOLDED="true" ID="ID_1666418991" CREATED="1607787159522" MODIFIED="1607787180290">
<node TEXT="①一个类要创建实例需要先加载并初始化该类" ID="ID_1454986959" CREATED="1607787209435" MODIFIED="1607787264579">
<node TEXT="main方法所在的类需要先加载和初始化" ID="ID_707189214" CREATED="1607787270993" MODIFIED="1607787293947"/>
</node>
<node TEXT="②一个子类初始化需要先初始化父类" ID="ID_117193192" CREATED="1607787310912" MODIFIED="1607787356434"/>
<node TEXT="③一个类初始化就是执行&lt;clinit&gt;()方法" ID="ID_1519262257" CREATED="1607787356880" MODIFIED="1607787529923">
<node TEXT="&lt;clinit&gt;()方法由静态类变量显式赋值代码和静态代码组成" ID="ID_443346535" CREATED="1607787438315" MODIFIED="1607787751768"/>
<node TEXT="类变量显示复制代码和静态代码块从上到下顺序执行" ID="ID_30695789" CREATED="1607787478336" MODIFIED="1607787506642"/>
<node TEXT="&lt;clinit&gt;()方法只执行一次" ID="ID_703579412" CREATED="1607787507016" MODIFIED="1607787515898"/>
</node>
</node>
<node TEXT="实例初始化过程" FOLDED="true" ID="ID_1807591454" CREATED="1607787168549" MODIFIED="1607787188546">
<node TEXT="①实例初始化就是执行&lt;init&gt;()方法" ID="ID_1254484764" CREATED="1607787816721" MODIFIED="1607787855138">
<node TEXT="&lt;init&gt;()方法可能重载有多个，有几个构造器就有几个&lt;init&gt;方法" ID="ID_1091695909" CREATED="1607787860643" MODIFIED="1607787897076"/>
<node TEXT="&lt;init&gt;()方法由非静态实例变量显式赋值代码和非静态代码块、对应构造器代码组成" ID="ID_912064688" CREATED="1607787897640" MODIFIED="1607787944114"/>
<node TEXT="非静态代码实例变量显式赋值代码和非静态代码块从上到下顺序执行，而对应构造器的代码最后执行" ID="ID_1211483792" CREATED="1607787953399" MODIFIED="1607788008482"/>
<node TEXT="每次创建实例对象，调用对应构造器，执行的就是对应的&lt;init&gt;方法" ID="ID_1589158266" CREATED="1607788015943" MODIFIED="1607788101880"/>
<node TEXT="&lt;init&gt;方法的首行是super()或super(实参列表)，即对应父类的&lt;init&gt;方法" ID="ID_1420442830" CREATED="1607788058679" MODIFIED="1607788097059"/>
</node>
</node>
<node TEXT="方法的重写" FOLDED="true" ID="ID_709770285" CREATED="1607787190103" MODIFIED="1607787196162">
<node TEXT="①哪些方法不可以重写" ID="ID_1574331908" CREATED="1607788558463" MODIFIED="1607788582763">
<node TEXT="final方法" ID="ID_297619220" CREATED="1607788861730" MODIFIED="1607788878977"/>
<node TEXT="静态方法" ID="ID_1185396862" CREATED="1607788868728" MODIFIED="1607788885450"/>
<node TEXT="private等子类中不可见方法" ID="ID_964242064" CREATED="1607788885719" MODIFIED="1607788896361"/>
</node>
<node TEXT="②对象的多态性" ID="ID_1152807263" CREATED="1607788583263" MODIFIED="1607788594954">
<node TEXT="子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码" ID="ID_7636063" CREATED="1607788903962" MODIFIED="1607788936995"/>
<node TEXT="非静态方法默认的调用对象是this" ID="ID_1961372034" CREATED="1607788937399" MODIFIED="1607788952058"/>
<node TEXT="this对象在构造器或者说&lt;init&gt;方法中就是正在创建的对象" ID="ID_1061928677" CREATED="1607788952366" MODIFIED="1607788982049"/>
</node>
</node>
</node>
</node>
</map>
