package leetcodeTest.middleHart;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Testcode
 * @description: 美丽字符串
 * @author: Fuwen
 * @create: 2021-03-06 23:52
 *5682. 所有子字符串美丽值之和
 * 一个字符串的 美丽值 定义为：出现频率最高字符与出现频率最低字符的出现次数之差。
 *
 * 比方说，"abaacc" 的美丽值为 3 - 1 = 2 。
 * 给你一个字符串 s ，请你返回它所有子字符串的 美丽值 之和
 **/
public class beautySumLeeCode {
    public int beautySum(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int totalSum = 0;
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            int[] counts = new int[26];
            for (int j = i; j < chs.length; j++) {
                counts[chs[j] - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                //26大小，相对来说就是o(1)
                for (int count : counts) {
                    if (count > 0) {
                        max = Math.max(max, count);
                        min = Math.min(min, count);
                    }
                }
                totalSum = totalSum + max - min;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(new beautySumLeeCode().beautySum("aabcb"));
    }
}
