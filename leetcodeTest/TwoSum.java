import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int a;
        int b;
        for (int i=0;i<numbers.length;i++){
             a=numbers[i];
             b=target-a;
             if (map.containsKey(b)){
                 return new int[]{map.get(b)+1,i+1};
             }else {
                 map.put(numbers[i],i);
             }
        }
        throw  new IllegalArgumentException("没有这个数组");
    }

    public static void main(String[] args) {
        int[] ints = new int[]{9,5,41,8,7,69,3,6,1,4,2};

        for (int a:
             new TwoSum().twoSum(ints,48)) {
            System.out.println(a+" ");
        }
    }
}

