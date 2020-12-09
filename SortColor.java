public class SortColor {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=nums.length-1;

        while(b<=c){
            if(nums[b]==0){
                swap(nums,a,b);
                a++;
                b++;
            }else if(nums[b]==1){
                b++;
            }else{
                swap(nums,b,c);
                c--;

            }
        }
    }

    private void swap(int[] ints, int a, int b) {
        int temp=ints[a];
        ints[a]=ints[b];
        ints [b]=temp;
    }

    public static void main(String[] args) {
        int[] d = {1,2,0};
        new SortColor().sortColors(d);
        for (int i:
             d) {
            System.out.print(i+",");

        }

    }
}
