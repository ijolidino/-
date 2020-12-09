public class findFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int left=search(nums,target,true);
        int right=search(nums,target,false)-1;
        if (left<=right&&right<nums.length&&nums[left]==target&&nums[right]==target){
            return new int[]{left,right};
        }
        return new int[]{-1,-1};
    }
    public int search(int[] nums,int target,boolean b){
        int left=0;
        int right=nums.length-1;
        int ans=nums.length;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]>target||(b&&nums[mid]>=target)){
                right=mid-1;
                ans=mid;
            }else {
                left=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ints = {5, 7, 7, 8, 8, 10};
        int a=8;
        for (int i:
             new findFirstAndLast().searchRange(ints,8)) {
            System.out.println(i);
        }
    }
    }


