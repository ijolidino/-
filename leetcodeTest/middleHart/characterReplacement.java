package leetcodeTest.middleHart;

import java.util.ArrayDeque;

/**
 * Create by Fuwen on 2021/2/2
 * 424. 替换后的最长重复字符
 * 给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。
 *
 * 注意：字符串长度 和 k 不会超过 104。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "ABAB", k = 2
 * 输出：4
 * 解释：用两个'A'替换为两个'B',反之亦然。
 * 示例 2：
 *
 * 输入：s = "AABABBA", k = 1
 * 输出：4
 * 解释：
 * 将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
 * 子串 "BBBB" 有最长重复字母, 答案为 4。
 */
public class characterReplacement {
    public int characterReplacement(String s, int k) {
        int a=0;
        int b=0;
        for (int i = 0; i < s.length(); i++) {
            int c=1;
            b=k;
            int j=i;
            while (j<s.length()-1&&(s.charAt(i)==s.charAt(j+1)||b>0)){
                if (s.charAt(i)==s.charAt(j+1)){
                    j++;
                }else {
                    b--;
                    j++;
                }
                c++;
            }
            if (c>=a){
                if (b>0){
                    a=c+b;
                }else {
                    a = c;
                }
            }
        }
        return Math.min(a,s.length());
    }

    public static void main(String[] args) {
        System.out.println(new characterReplacement().characterReplacement("AABABBA",1));
    }
}
