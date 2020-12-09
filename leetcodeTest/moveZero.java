public class moveZero {
    public void moveZeroes(int[] nums) {
        int b=0;
        int a=0;
        int c=nums.length;
        while (b<c){
            if (nums[b]!=0){
                swap(nums,a,b);
                a++;
            }
            b++;
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[b];
        nums[b]=nums[a];
        nums[a]=temp;
    }

    public static void main(String[] args) {
        moveZero moveZero = new moveZero();
        int[] ad = new int[]{7,6,8,0,0,9,6,4,0,5};
        moveZero.moveZeroes(ad);
        for (int x:ad
             ) {
            System.out.print(x+",");
        }

    }
}
