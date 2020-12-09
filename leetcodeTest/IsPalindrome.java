import java.util.Arrays;

/*
验证回文串
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/all-about-array/x9tqjc/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String d=s.toLowerCase();
        char[] ss=d.toCharArray();

        if (ss.length<2){
            return true;
        }
         if (ss.length==2&&Character.isLetter(s.charAt(0))&&Character.isLetter(s.charAt(1))&&ss[0]!=ss[1]){
            return false;
        }else if (s.length()==2&&(Character.isDigit(s.charAt(0))||Character.isDigit(s.charAt(1)))){
             return false;
         }
         else if (s.length()==2&&s.contentEquals(" ")){
            return false;
        }else if (s.length()>=3){


            StringBuilder builder = new StringBuilder();

            for (int i=0;i<s.length();i++){
                if (Character.isLetter(ss[i])||Character.isDigit(ss[i])){
                    builder.append(ss[i]);
                }
            }
            String a=builder.toString();
            if (builder.reverse().toString().equals(a)){
                return true;
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s="1a2";
        System.out.println(new IsPalindrome().isPalindrome(s));
    }
}
