import java.util.Arrays;

public class MaximumGap {

    public int maximumGap(int[] nums) {
        if(nums.length <= 1)        return 0;
        int n = nums.length;

        int max = -1, min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        if(max - min == 0)      return 0;   //1,1,1,1

        int[] bucketMin = new int[n-1];
        int[] bucketMax = new int[n-1];
        Arrays.fill(bucketMax, -1);
        Arrays.fill(bucketMin, Integer.MAX_VALUE);

        //
        int interval = (int) Math.ceil((double)(max - min) / (n - 1));
        for(int i = 0; i < nums.length; i++)
        {
            int ID = (nums[i] - min) / interval;
            if(nums[i] == min || nums[i] == max)    continue;
            bucketMax[ID] = Math.max(bucketMax[ID], nums[i]);
            bucketMin[ID] = Math.min(bucketMin[ID], nums[i]);
        }

        int maxGap = 0; int previousMax = min;
        for(int i = 0; i < n - 1; i++)
        {
            if(bucketMax[i] == -1)     continue;
            maxGap = Math.max(bucketMin[i] - previousMax, maxGap);
            previousMax = bucketMax[i];
        }

        //1, 100000
        maxGap = Math.max(maxGap, max - previousMax);
        return maxGap;
    }

    public static void main(String[] args) {
        int[] ints = {3, 6, 9, 1};
        System.out.println(new MaximumGap().maximumGap(ints));
    }
}
