<map version="freeplane 1.8.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="Github高级" FOLDED="false" ID="ID_765248905" CREATED="1607770647282" MODIFIED="1607770694591" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle" zoom="2.143">
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
<hook NAME="AutomaticEdgeColor" COUNTER="8" RULE="ON_BRANCH_CREATION"/>
<node TEXT="常用词含义" POSITION="right" ID="ID_602293811" CREATED="1607770752997" MODIFIED="1607770774527">
<edge COLOR="#ff0000"/>
<font SIZE="16"/>
<node TEXT="watch：会持续收到该项目的动态" ID="ID_768619440" CREATED="1607770763896" MODIFIED="1607770800423">
<font SIZE="16"/>
</node>
<node TEXT="fork：复制某个项目到自己的Github仓库中" ID="ID_1062936313" CREATED="1607770804963" MODIFIED="1607770826454">
<font SIZE="16"/>
</node>
<node TEXT="star：可以理解为点赞" ID="ID_918228266" CREATED="1607770830642" MODIFIED="1607770846440">
<font SIZE="16"/>
</node>
<node TEXT="clone：将项目下载至本地" ID="ID_208190609" CREATED="1607770856160" MODIFIED="1607770875016">
<font SIZE="16"/>
</node>
<node TEXT="follow：关注你感兴趣的作者，会收到他们的动态" ID="ID_1082895807" CREATED="1607770878508" MODIFIED="1607770903808">
<font SIZE="16"/>
</node>
</node>
<node TEXT="IN限制搜索范围" POSITION="right" ID="ID_473877189" CREATED="1607770999523" MODIFIED="1607771104320">
<edge COLOR="#0000ff"/>
<font SIZE="16"/>
<node TEXT="xxx关键词 in:name或description或readme" ID="ID_468094400" CREATED="1607771107424" MODIFIED="1607771138551">
<node TEXT="xxx in:name 项目包含xxx的" ID="ID_799288295" CREATED="1607771162484" MODIFIED="1607771188567"/>
<node TEXT="xxx in:description 项目描述包含xxx的" ID="ID_1839843089" CREATED="1607771192854" MODIFIED="1607771209752"/>
<node TEXT="xxx in:readme 项目的readme文件中包含xxx的" ID="ID_1750844927" CREATED="1607771213559" MODIFIED="1607771231336"/>
</node>
<node TEXT="组合使用" ID="ID_560779154" CREATED="1607771279094" MODIFIED="1607771292687">
<node TEXT="搜索项目名或者readme中包含秒杀的项目" ID="ID_1968056694" CREATED="1607771300417" MODIFIED="1607771318639"/>
<node TEXT="seckill in:name,readme" ID="ID_658415475" CREATED="1607771323587" MODIFIED="1607771336815"/>
</node>
</node>
<node TEXT="stars或fork数量关键词去查找" POSITION="right" ID="ID_1333815260" CREATED="1607771432658" MODIFIED="1607771499863">
<edge COLOR="#00ff00"/>
<font SIZE="16"/>
<node TEXT="公式" ID="ID_255115799" CREATED="1607771481784" MODIFIED="1607772051023">
<node TEXT="xxx关键词 stars 通配符" ID="ID_1209104111" CREATED="1607771512225" MODIFIED="1607771523503">
<node TEXT=":&gt; 或者:&gt;=" ID="ID_48731255" CREATED="1607771537451" MODIFIED="1607771564213"/>
</node>
<node TEXT="区间范围数字" ID="ID_1673399589" CREATED="1607771526141" MODIFIED="1607771571239">
<node TEXT="数字1..数字2" ID="ID_1685913034" CREATED="1607771576746" MODIFIED="1607771592851"/>
</node>
<node TEXT="查找stars数大于5000的springboot项目" ID="ID_1655874230" CREATED="1607771572197" MODIFIED="1607771632280">
<node TEXT="springboot stars:&gt;=5000" ID="ID_900624481" CREATED="1607771637991" MODIFIED="1607771671055"/>
</node>
<node TEXT="查找fork数大于500的springboot的项目" ID="ID_371855512" CREATED="1607771991558" MODIFIED="1607772024297">
<node TEXT="springboot:&gt;500" ID="ID_270364468" CREATED="1607772031143" MODIFIED="1607772050573"/>
</node>
<node TEXT="查找fork在100到200之间并且stars数在80到100之间的springboot项目" ID="ID_251664961" CREATED="1607772025277" MODIFIED="1607772099673">
<node TEXT="springboot forks :100..200 stars:80..100" ID="ID_1893807265" CREATED="1607772103561" MODIFIED="1607772140990"/>
</node>
</node>
</node>
<node TEXT="awesome加强搜索" POSITION="right" ID="ID_198969004" CREATED="1607772272293" MODIFIED="1607772295735">
<edge COLOR="#ff00ff"/>
<font SIZE="16"/>
<node TEXT="公式" ID="ID_589102543" CREATED="1607772281631" MODIFIED="1607772346162">
<node TEXT="awesome 关键字" ID="ID_391715793" CREATED="1607772347785" MODIFIED="1607772355071">
<node TEXT="awesome系列一般是用来收集学习、工具、书籍类相关的项目" ID="ID_8260772" CREATED="1607772362384" MODIFIED="1607772483988"/>
</node>
</node>
<node TEXT="搜索优秀的redis相关的项目，包括框架、教程等" ID="ID_165219792" CREATED="1607772299310" MODIFIED="1607772326758"/>
</node>
<node TEXT="高亮显示GitHub上的代码" POSITION="right" ID="ID_1056956941" CREATED="1607772772349" MODIFIED="1607772791887">
<edge COLOR="#00ffff"/>
<font SIZE="16"/>
<node TEXT="1行：地址后面紧跟#L数字" ID="ID_961291822" CREATED="1607772777679" MODIFIED="1607772814990">
<node TEXT="例子：https://github.com/ijolidino/leetCodeTest/blob/master/leetcodeTest/BublleSort.java#L6" ID="ID_1069803457" CREATED="1607772889655" MODIFIED="1607772989574"/>
</node>
<node TEXT="地址后面紧跟#数字-L数字" ID="ID_1459519753" CREATED="1607772818197" MODIFIED="1607772834743">
<node TEXT="例子：https://github.com/ijolidino/leetCodeTest/blob/master/leetcodeTest/BublleSort.java#L6-#L18" ID="ID_1678704715" CREATED="1607772924519" MODIFIED="1607772994745"/>
</node>
</node>
<node TEXT="项目内搜索" POSITION="right" ID="ID_1783061547" CREATED="1607773055717" MODIFIED="1607773067598">
<edge COLOR="#7c0000"/>
<font SIZE="16"/>
<node TEXT="英文字母t" ID="ID_1364269252" CREATED="1607773071670" MODIFIED="1607773107379"/>
<node TEXT="https://docs.github.com/en/free-pro-team@latest/github/getting-started-with-github/keyboard-shortcuts?algolia-query=short#about-keyboard-shortcuts" ID="ID_394523004" CREATED="1607773160836" MODIFIED="1607773428584"/>
</node>
<node TEXT="搜索某个地区内的大佬" POSITION="right" ID="ID_1960695680" CREATED="1607773439788" MODIFIED="1607773457391">
<edge COLOR="#00007c"/>
<node TEXT="北京地区的java开发大神" ID="ID_633449242" CREATED="1607773462880" MODIFIED="1607773483439">
<node TEXT="location:beijing language:java" ID="ID_1059464360" CREATED="1607773484255" MODIFIED="1607773501990"/>
</node>
</node>
</node>
</map>
