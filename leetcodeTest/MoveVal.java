/*
给定 nums = [0,1,2,2,3,0,4,2], val = 2,

函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。

注意这五个元素可为任意顺序。

你不需要考虑数组中超出新长度后面的元素。
 */
public class MoveVal {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{9,5,7,1,3,0,8,7,5,4,0,7};
        System.out.println(new MoveVal().removeElement(ints,5));
    }
}
