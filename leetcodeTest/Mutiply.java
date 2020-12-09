import java.util.Hashtable;

class Multiply {
public int[]  mu(int [] nums ,long target){
    Hashtable<Integer, Integer> integerHashtable = new Hashtable<>();
    for (int i=0;i<nums.length;i++){
        if (integerHashtable.containsKey(target/nums[i])){
            return new int[]{integerHashtable.get(target/nums[i]),i};
        }
        integerHashtable.put(nums[i],i);
    }
    return new int[0];
}
    public static void main(String[] args) {
        new Multiply();
    }
}
