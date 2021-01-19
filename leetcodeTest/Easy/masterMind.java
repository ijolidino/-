package leetcodeTest.Easy;

import java.util.HashMap;

/**
 * Create by Fuwen on 2021/1/19
 * 面试题 16.15. 珠玑妙算
 * 珠玑妙算游戏（the game of master mind）的玩法如下。
 *
 * 计算机有4个槽，每个槽放一个球，颜色可能是红色（R）、黄色（Y）、绿色（G）或蓝色（B）。例如，计算机可能有RGGB 4种（槽1为红色，槽2、3为绿色，槽4为蓝色）。作为用户，你试图猜出颜色组合。打个比方，你可能会猜YRGB。要是猜对某个槽的颜色，则算一次“猜中”；要是只猜对颜色但槽位猜错了，则算一次“伪猜中”。注意，“猜中”不能算入“伪猜中”。
 *
 * 给定一种颜色组合solution和一个猜测guess，编写一个方法，返回猜中和伪猜中的次数answer，其中answer[0]为猜中的次数，answer[1]为伪猜中的次数。
 *
 * 示例：
 *
 * 输入： solution="RGBY",guess="GGRR"
 * 输出： [1,1]
 * 解释： 猜中1次，伪猜中1次。
 */
public class masterMind {
    public int[] masterMind(String solution, String guess) {
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < solution.length(); i++) {
            if (!map.containsKey(solution.charAt(i))){
                map.put(solution.charAt(i),1);
            }else {
                map.put(solution.charAt(i),map.get(solution.charAt(i))+1);
            }
            if (!map1.containsKey(guess.charAt(i))){
                map1.put(guess.charAt(i),1);
            }else {
                map1.put(guess.charAt(i),map1.get(guess.charAt(i))+1);
            }
            if (solution.charAt(i)==guess.charAt(i)){
                count++;
            }
        }
        int count1=0;
        count1+=Math.min(map.getOrDefault('R', 0), map1.getOrDefault('R', 0));
        count1+=Math.min(map.getOrDefault('G', 0), map1.getOrDefault('G', 0));
        count1+=Math.min(map.getOrDefault('B', 0), map1.getOrDefault('B', 0));
        count1+=Math.min(map.getOrDefault('Y', 0), map1.getOrDefault('Y', 0));
        return new int[]{count,count1-count};
    }

    public static void main(String[] args) {
        new masterMind().masterMind("RGBY","GGRR");
    }
}
