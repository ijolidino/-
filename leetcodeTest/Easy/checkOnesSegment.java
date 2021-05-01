package leetcodeTest.Easy;

/**
 * @program: Testcode
 * @description: 5697. 检查二进制字符串字段
 * @author: Fuwen
 * @create: 2021-03-07 10:33
 * 给你一个二进制字符串 s ，该字符串 不含前导零 。
 *
 * 如果 s 最多包含 一个由连续的 '1' 组成的字段 ，返回 true​​​ 。否则，返回 false 。
 **/
public class checkOnesSegment {
    public boolean checkOnesSegment(String s) {
        boolean b=true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='0'&&b==true){
                b=false;
            }
            if (s.charAt(i)=='1'&&b==false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new checkOnesSegment().checkOnesSegment("11000"));
    }
}
