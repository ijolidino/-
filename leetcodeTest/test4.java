public class test4 {
    public static void main(String[] args) {
        int i,j;
        int a[]={2,1,4,8,9,5,3};
        for(i=0;i<a.length-1;i++){
            int k=i;
            for(j=i;j<a.length;j++){
                if (a[j]<a[k]) k=j;
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
            }
            for (i=0;i<a.length;i++){
                if(i%2==0){
                    a[i]++;
                }else {
                    a[i]--;
                }
                System.out.println(a[i]+" ");
            }
        }
    }
}
