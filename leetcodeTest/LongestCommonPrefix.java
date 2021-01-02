package leetcodeTest;

import java.util.Arrays;

/**
 * Create by Fuwen on 2021/1/2
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (!chestr(strs)){
            return "";
        }
        String result="";
        int l=strs.length;
        Arrays.sort(strs);
        String a=strs[0];
        String b=strs[l-1];
        int m=Math.min(a.length(),b.length());
        for (int i = 0; i < m; i++) {
            if (a.charAt(i)==b.charAt(i)){
                result+=a.charAt(i);
            }else {
                break;
            }
        }
        return result;
    }
    public static boolean chestr(String[] strs){
        boolean b=true;
        if(strs.length==0){
            b=false;
            return b;
        }
        int l=strs.length;
        for (int i = 0; i < l; i++) {
            if (strs[i]==null||strs[i].length()==0){
                b=false;
                return b;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{ "customer", "car", "cat" }));
    }
}
