package leetcodeTest;

import java.util.ArrayDeque;

/**
 * Create by Fuwen on 2020/12/20
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 *
 * 注意：该题与 1081 https://leetcode-cn.com/problems/smallest-subsequence-of-distinct-characters 相同
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 *
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-letters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        boolean[] booleans = new boolean[26];
        char[] chars = s.toCharArray();
        int[] ch = new int[26];
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            ch[chars[i]-'a']=i;
        }
        for (int i = 0; i < s.length(); i++) {
            if (booleans[chars[i]-'a']){
                continue;
            }
            while (!arrayDeque.isEmpty()&&arrayDeque.peekLast()>chars[i]&&ch[arrayDeque.peekLast()-'a']>i){
                char c=arrayDeque.removeLast();
                booleans[c-'a']=false;
            }
            arrayDeque.addLast(chars[i]);
            booleans[chars[i]-'a']=true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c :
                arrayDeque) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(        new RemoveDuplicateLetters().removeDuplicateLetters("cbacdcbc")
        );
    }
}
