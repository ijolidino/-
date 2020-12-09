import java.util.Arrays;

class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }
        }
        if (nums[0]>target){
            int[] newA=new int[nums.length+1];
            for (int j=0;j<nums.length;j++){
                newA[j+1]=nums[j];
            }
            newA[0]=target;
            return 0;
        }
        if (target>nums[nums.length-1]){
            int [] newA=new int[nums.length+1];
            newA[nums.length]=target;
            return nums.length;
        }
        if (nums[0]<target&&target<nums[nums.length-1]){

            int[] newA=new int[nums.length+1];
            for (int i=0;i<nums.length;i++){
                newA[i]=nums[i];
            }
                newA[newA.length-1]=target;
            Arrays.sort(newA);
           for (int i=0;i<newA.length;i++){
               if (newA[i]==target){
                   return i;
               }
           }
        }
        return 100;
    }

    public static void main(String[] args) {
        int[] a={1,3,5};
        int tar=4;

        Solution solution = new Solution();
        System.out.println(solution.searchInsert(a,tar));

    }
}
