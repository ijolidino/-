package leetcodeTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by Fuwen on 2020/12/16
 */
/*
给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。

这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。

示例1:

输入: pattern = "abba", str = "dog cat cat dog"
输出: true
示例 2:

输入:pattern = "abba", str = "dog cat cat fish"
输出: false
示例 3:

输入: pattern = "aaaa", str = "dog cat cat dog"
输出: false
示例 4:

输入: pattern = "abba", str = "dog dog dog dog"
输出: false
说明:
你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。    

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/word-pattern
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class WordPattern {

        public boolean wordPattern(String pattern, String str) {
            HashMap<String, Character> str2patt = new HashMap<>();
            HashMap<Character, String> patt2str = new HashMap<>();
            int j=0;

            for (int i=0;i<pattern.length();i++){
                char pa=pattern.charAt(i);
                if (j>=str.length()){
                    return false;
                }
                int k=j;
                while (k<str.length()&&str.charAt(k)!=' '){
                    k++;
                }
                String tmp=str.substring(j,k);
                if (str2patt.containsKey(tmp)&&pa!=str2patt.get(tmp)){
                    return false;
                }
                if (patt2str.containsKey(pa)&&!tmp.equals(patt2str.get(pa))){
                    return false;
                }
                    str2patt.put(tmp,pa);
                    patt2str.put(pa,tmp);
                j=k+1;
            }
            return j>str.length();

        }

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern("abba","dog cat cat fish"));
        System.out.println(new WordPattern().wordPattern("abba","dog cat cat dog"));

    }

}
