package leetcodeTest.middleHart;

/**
 * @program: Testcode
 * @description: 重复k个字符串
 * @author: Fuwen
 * @create: 2021-02-27 10:10
 **/
public class longestSubstringLeecode {
    public int longestSubstring(String s, int k) {
        return dfs(s,k,0,s.length());
    }
    private int dfs(String s,int k,int l,int r){
        // 遍历记录每个字母的出现次数
        int[] count = new int[26];
        for (int i = l; i < r; i++) {
            int pos = s.charAt(i) - 'a';
            count[pos]++;
        }
        // 遍历统计数组，看哪个字母的出现次数少于k而且不为0，包含这个字母的子数组必然不是答案
        char target = '0';
        for (int i = 0; i < 26; i++) {
            if (count[i] < k && count[i] != 0){
                target = (char) (i+'a');
                break;
            }
        }
        // 如果遍历完毕之后没有找到次数少于k的字母，说明这个区间是合理的，返回区间长度
        if (target == '0') return r - l;
        // 左右指针指向下一次dfs的区间
        int i = l;
        int j = i;
        int res = 0;
        while (j <= r){
            // 如果右指针到了当前的最右边
            if (j == r){
                // 当前区间的长度大于等于k，是一个可能的解
                if (j - i >= k){
                    res = Math.max(res,dfs(s,k,i,j));
                }
                break;
            }
            // 遇到了次数少于k的字母
            if (s.charAt(j) == target){
                // 看当前区间的长度是否大于k，大于k就是一个可能的解
                if (j - i >= k){
                    res = Math.max(res,dfs(s,k,i,j));
                }
                // i到j无论是不是可用区间都已经处理完毕，i跳到j的下一个字符，不能包括当前这个小于k个的字母
                i = j+1;
            }
            // 无论是否遇到次数小于k的字母，j都前进
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new longestSubstringLeecode().longestSubstring("ababbc",2));
    }
}
