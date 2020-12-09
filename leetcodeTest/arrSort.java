import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class arrSort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            int value = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == value) {
                    if (k == j) {
                        k++;
                    } else {
                        int tmp = arr1[j];
                        arr1[j] = arr1[k];
                        arr1[k] = tmp;
                        k++;
                    }
                }
            }
        }
        Arrays.sort(arr1, k, arr1.length );
        return arr1;
    }

    public static void main(String[] args) {
        arrSort arrSort = new arrSort();
        int[] arr1 = new int[] {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        ;
        for (int i:arrSort.relativeSortArray(arr1,arr2)
             ) {
            System.out.print(i+",");
        }
    }
}
