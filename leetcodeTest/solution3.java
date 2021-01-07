package leetcodeTest;

/**
 * Create by Fuwen on 2021/1/6
 */
public class solution3 {
    public static void main(String[] args) {
        String s1 = new String("sdfASFVFA");
        char[] chars = s1.toCharArray();
        System.out.println(chars);//sdfASFVFA
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){//如果是大写字母则转小写
                chars[i]=Character.toLowerCase(chars[i]);
            }else if (Character.isLowerCase(chars[i])){//如果是小写字母则转大写
                chars[i]=Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(chars);//SDFasfvfa
    }
}
