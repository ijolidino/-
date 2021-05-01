package leetcodeTest.Easy;

/**
 * @program: Testcode
 * @description: 翻转数
 * @author: Fuwen
 * @create: 2021-03-06 09:49
 **/
public class isFlipedStringLeeCode {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals("") && s2.equals("")){
            return true;
        }
        int len = 0;
        String s = s2 + s2;
        for (int i = 0; i < s.length(); i++) {
            int j=i;
            len=0;
            int k=0;
            while (k<s1.length()&&j<s.length()&&s.charAt(j)==s1.charAt(k)){
                len++;
                j++;
                k++;
            }
            if (len==s1.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new isFlipedStringLeeCode().isFlipedString("",""));
    }
}
