package leetcodeTest;

/**
 * Create by Fuwen on 2021/1/3
 * 28. 实现 strStr()
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(); int len2 = needle.length();
        if(len2 > len1){
            return -1;
        }
        if(len2 == 0){
            return 0;
        }
        for(int i = 0; i < len1 - len2 + 1; ++i){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i + len2).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new ImplementstrStr().strStr("mississippi",
                "issipi"));
    }
}
