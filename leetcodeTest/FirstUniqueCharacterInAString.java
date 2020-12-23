package leetcodeTest;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Create by Fuwen on 2020/12/23
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 *
 * 提示：你可以假定该字符串只包含小写字母。
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hashtable.containsKey(s.charAt(i))){
                hashtable.put(s.charAt(i),1);
            }else {
                hashtable.replace(s.charAt(i),hashtable.get(s.charAt(i)),hashtable.get(s.charAt(i))+1);

            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashtable.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInAString().firstUniqChar("aadadaad"));
    }
}
