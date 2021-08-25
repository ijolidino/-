package testclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: leetcodeTest
 * @description: 左右移动
 * @author: Fuwen
 * @create: 2021-08-25 22:25
 **/
public class LeftAndRightMove {
    public static void main(String[] args) {
        String[] strings = {"abc", "def", "ghi"};
        List<String> collect = Arrays.stream(strings).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        HashMap<String, Integer> map = new HashMap<>();
        String ss="abc";
        String aa="acd";
        System.out.println(ss.compareTo(aa));
        for (String s : strings) {
            for (int i = 0; i < (1 << s.length()); i++) {
                StringBuilder t = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    if (((i >> j) & 1) != 0) {
                        t.append(s.charAt(j));
                    }
                }
                if (map.containsKey(t.toString())) {
                    map.put(t.toString(), map.get(t.toString()) + 1);
                } else {
                    map.put(t.toString(), 1);
                }
            }
        }
        int res = -1;
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                res = Math.max(res, s.length());
            }
        }
    }
}

