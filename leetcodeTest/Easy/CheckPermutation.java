package leetcodeTest.Easy;

import java.util.HashMap;

/**
 * Create by Fuwen on 2021/1/30
 * 面试题 01.02. 判定是否互为字符重排
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 *
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 */
public class CheckPermutation {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (a.containsKey(s1.charAt(i))){
                a.put(s1.charAt(i),a.get(s1.charAt(i))+1);
            }else {
                a.put(s1.charAt(i),1);
            }
            if (b.containsKey(s2.charAt(i))){
                b.put(s2.charAt(i),b.get(s2.charAt(i))+1);
            }else {
                b.put(s2.charAt(i),1);
            }
        }
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(new CheckPermutation().CheckPermutation("abc","bad"));
    }
}
