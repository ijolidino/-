import java.util.Arrays;


public class SortString {
    public String sortString(String s) {
        if(s.length()<=1){
            return s;
        }

         StringBuilder result = new StringBuilder();
        char[] a=s.toCharArray();
        int k=0;
        int l=a.length-1;
        Arrays.sort(a);
        while(k<l){
            result.append(a[k]);
            while (a[k]==a[k+1]){
                k++;
            }
            while (a[k+1]==a[k+2]){
                result.append(a[k+1]);
                k++;
            }result.append(a[k+1]);
            k+=1;
            result.append(a[l]);
            while (a[l]==a[l-1]){
                l--;
            }
            while (a[l-1]==a[l-2]){
                result.append(a[l-1]);
                l--;
            }
            result.append(a[l-1]);
            l-=1;

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s="aaaabbbbcccc";
        System.out.println(new SortString().sortString(s));
    }
}
