import java.util.Arrays;

public class largestPerimeter {
    public int largestPerimeter(int[] A) {
        if (A.length<3){
            return 0;
        }
        Arrays.sort(A);
        for (int i=0;i<A.length-3;i++){
            if (A[i]+A[i+1]>A[i+2]){
                return A[i]+A[i+1]+A[i+2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int [] ints= new int[]{2,2,16,5,7,3,4,3};
        System.out.println(new largestPerimeter().largestPerimeter(ints));
    }
}
