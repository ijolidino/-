package leetcodeTest;

/**
 * Create by Fuwen on 2021/1/6
 */
public class solution2 {
    public static String compressStr(String str){
        StringBuilder stringBuilder = new StringBuilder();
        int sum=1;//连续字符个数
        char c1=str.charAt(0);//取出第一个字符
        for (int i = 0; i < str.length(); i++) {
            char c2=str.charAt(i);//循环取字符
            if (c1==c2){//把当前字符和前一个字符比较
                sum++;//相同数字加一
                continue;
            }
            //拼接字符
            if (sum>1){
                stringBuilder.append(c1).append(sum);

            }else {
                stringBuilder.append(c1);
            }
            //当前字符变为前一个字符
            c1=c2;
            //个数归一
            sum=1;
        }
        //加最后一个字符及个数
        if (sum>1){
            stringBuilder.append(c1).append(sum);

        }else {
            stringBuilder.append(c1);
        }
        return stringBuilder.toString();
    }

}
