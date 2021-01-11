package leetcodeTest.Easy;

/**
 * Create by Fuwen on 2021/1/11
 * 1550. 存在连续三个奇数的数组
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [2,6,4,1]
 * 输出：false
 * 解释：不存在连续三个元素都是奇数的情况。
 * 示例 2：
 *
 * 输入：arr = [1,2,34,3,4,5,7,23,12]
 * 输出：true
 * 解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。
 */
public class threeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int len =arr.length;
        if (len<3){
            return false;
        }
        int count =0;
        for (int i = 0; i < len-2; i++) {
            if (arr[i]%2==1||arr[i]%2==-1){
                count++;
            }
            if (arr[i+1]%2==1||arr[i+1]%2==-1){
                count++;
            }
            if (arr[i+2]%2==1||arr[i+2]%2==-1){
                count++;
            }
            if (count==3){
                return true;
            }else {
                count=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new threeConsecutiveOdds().threeConsecutiveOdds(new int[]{1,2,34,3,4,-5,7,23,12}));
    }
}
