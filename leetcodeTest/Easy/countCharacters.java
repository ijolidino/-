package leetcodeTest.Easy;

import java.util.Hashtable;

/**
 * Create by Fuwen on 2021/1/13
 * 1160. 拼写单词
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *
 *
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 *
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 */
public class countCharacters {
    public int countCharacters(String[] words, String chars) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        int len=0;
        for (int i = 0; i < chars.length(); i++) {
            if (!hashtable.containsKey(chars.charAt(i))){
                hashtable.put(chars.charAt(i),1);
            }else {
                hashtable.replace(chars.charAt(i),hashtable.get(chars.charAt(i))+1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            int count=0;

                Hashtable<Character, Integer> hashtable1 = new Hashtable<>();
                for (int k = 0; k < words[i].length(); k++) {
                    if (!hashtable1.containsKey(words[i].charAt(k))){
                        hashtable1.put(words[i].charAt(k),1);
                    }else {
                        hashtable1.replace(words[i].charAt(k),hashtable1.get(words[i].charAt(k))+1);
                    }
                }

            for (int j = 0; j <words[i].length() ; j++) {
                if (hashtable.containsKey(words[i].charAt(j))&&hashtable1.get(words[i].charAt(j))<=hashtable.get(words[i].charAt(j))){
                    count++;
                }
            }
            if (count==words[i].length()){
                for (int j = 0; j < words[i].length(); j++) {
                    hashtable.replace(words[i].charAt(j),hashtable.get(words[i].charAt(j))-1);
                }
                len+=words[i].length();
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String[] strings = {"cat", "bt", "hat", "tree"};
        System.out.println(new countCharacters().countCharacters(strings,"atach"));
    }
}
