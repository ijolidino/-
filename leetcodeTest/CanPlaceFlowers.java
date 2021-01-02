package leetcodeTest;/**
    Create by Fuwen on 2021/1/1
 605. 种花问题
 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。

 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。

 示例 1:

 输入: flowerbed = [1,0,0,0,1], n = 1
 输出: True
 示例 2:

 输入: flowerbed = [1,0,0,0,1], n = 2
 输出: False

 */public class CanPlaceFlowers {

        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            int m = flowerbed.length;
            int prev = -1;
            for (int i = 0; i < m; i++) {
                if (flowerbed[i] == 1) {
                    if (prev < 0) {
                        count += i / 2;
                    } else {
                        count += (i - prev - 2) / 2;
                    }
                    prev = i;
                }
            }
            if (prev < 0) {
                count += (m + 1) / 2;
            } else {
                count += (m - prev - 1) / 2;
            }
            return count >= n;
        }


    public static void main(String[] args) {
        System.out.println(3/2);
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(new int[]{1,0,0,0,0,0},3));
    }
}
