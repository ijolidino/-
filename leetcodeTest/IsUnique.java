public class IsUnique {
    public boolean isUnique(String astr) {
        if(astr.length()<=1){
            return true;
        }
        int [] ints=new int[26];
        int count=0;
        for(int i=0;i<astr.length();i++){
            ints[astr.charAt(i)-'a']++;
        }
        for(int j=0;j<25;j++){
            if(ints[j]>1){
                count++;
            }

        }
        return count>=1 ? false:true;
    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(new IsUnique().isUnique(s));
    }
}
