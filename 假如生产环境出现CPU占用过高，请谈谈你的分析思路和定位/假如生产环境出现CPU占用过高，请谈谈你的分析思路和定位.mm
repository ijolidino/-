<map version="freeplane 1.8.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="假如生产环境出现CPU占用过高，请谈谈你的分析思路和定位" LOCALIZED_STYLE_REF="AutomaticLayout.level,1" FOLDED="false" ID="ID_700162789" CREATED="1607768419686" MODIFIED="1607770583703" TEXT_SHORTENED="true"><hook NAME="MapStyle" zoom="1.33">
    <properties fit_to_viewport="false" edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff"/>

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
<hook NAME="AutomaticEdgeColor" COUNTER="12" RULE="ON_BRANCH_CREATION"/>
<node TEXT="结合Linux和JDK命令一块分析" LOCALIZED_STYLE_REF="AutomaticLayout.level,1" POSITION="right" ID="ID_1402454973" CREATED="1607768817304" MODIFIED="1607769273876" HGAP_QUANTITY="17.749999888241295 pt" VSHIFT_QUANTITY="-11.999999642372142 pt">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="案例步骤" LOCALIZED_STYLE_REF="AutomaticLayout.level,1" FOLDED="true" POSITION="right" ID="ID_1572076750" CREATED="1607768771761" MODIFIED="1607769780840" HGAP_QUANTITY="37.999999284744284 pt" VSHIFT_QUANTITY="20.999999374151248 pt">
<edge COLOR="#00ffff"/>
<node TEXT="1、先用top命令找出CPU占比最高的" FOLDED="true" ID="ID_1447802047" CREATED="1607768944264" MODIFIED="1607769461662">
<font SIZE="16"/>
<node TEXT="" LOCALIZED_STYLE_REF="AutomaticLayout.level,1" ID="ID_1743092542" CREATED="1607768984713" MODIFIED="1607769189594">
<hook URI="top命令.PNG" SIZE="1.0" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="2、使用ps -ef或者jps进一步定位，得知是怎样的后台程序给我们惹事" ID="ID_101576467" CREATED="1607769295566" MODIFIED="1607769458694">
<font SIZE="16"/>
<node TEXT="" ID="ID_346856244" CREATED="1607769357063" MODIFIED="1607769388800">
<hook URI="ps%20-ef命令.PNG" SIZE="0.78125" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="3、定位到具体吸纳成或者代码" ID="ID_44684191" CREATED="1607769431569" MODIFIED="1607769780839">
<font SIZE="16"/>
<node TEXT="ps -mp 进程编号 -o THREAD,tid,time" FOLDED="true" ID="ID_1255481156" CREATED="1607769483577" MODIFIED="1607769549350">
<node TEXT="" ID="ID_477619167" CREATED="1607769579088" MODIFIED="1607769612370">
<hook URI="ps%20-mp%20进程.PNG" SIZE="0.96153843" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="参数解释" ID="ID_1898947410" CREATED="1607769515878" MODIFIED="1607769523864">
<node TEXT="-m显示所有线程" ID="ID_1000347344" CREATED="1607769657280" MODIFIED="1607769668984"/>
<node TEXT="-p pid 进程使用cpu的时间" ID="ID_1835255970" CREATED="1607769672275" MODIFIED="1607769697392"/>
<node TEXT="-o 该参数后是用户自定义格式" ID="ID_1785539040" CREATED="1607769709229" MODIFIED="1607769730471"/>
</node>
</node>
<node TEXT="4、将需要的线程ID转换为16禁止格式（英文小写格式）" ID="ID_596330855" CREATED="1607769793392" MODIFIED="1607769951505">
<font SIZE="16"/>
<node TEXT="printf&quot;%x\n&quot; 有问题的线程ID" ID="ID_1057632390" CREATED="1607769834009" MODIFIED="1607769894639"/>
</node>
<node TEXT="5、jstack进程ID | grep tid（16进制线程ID小写英文）-A60" ID="ID_717789533" CREATED="1607770088342" MODIFIED="1607770215523">
<font SIZE="16"/>
<hook URI="分析16进制线程ID.PNG" SIZE="0.6944444" NAME="ExternalObject"/>
</node>
</node>
</node>
</map>
