public class Test3 {
    public static void main(String[] args) {
        //第三种方法，(尾插法)不另外开辟空间，将第一个数组看作两个数组，然后进行操作
        int nums1[]=new int[]{1,2,5,6,7,0,0,0};
        int nums2[]=new int[]{3,8,9};
//          n1代表数组1中元素（存在元素，0不算）末尾的下标。
        int n1=nums1.length-nums2.length-1;
//          n2代表数组二中末尾的下标
        int n2=nums2.length-1;
//          尾插法，i从“新数组”（将nums1看成两个数组）的末尾下标，然后比较将元素从末尾插入到新数组中
        for (int i=nums1.length - 1; i >=0; i--) {
//              n1+1代表nums1中元素的个数，当nums1中的元素的个数为0时，就将nums2中的元素从末尾依次插入新数组（nums1额外空间）中
            if ((n1+1)==0){
                nums1[i]=nums2[n2];
                n2--;
            }
//               n2+1代表nums2的元素个数，为0时跳出，然后剩与元素就为nums1中的元素
            else if ((n2+1) == 0) {
                break;
            }
//               判断，当nums1末尾元素大于nums2末尾元素时，则将nums1添加到新数组（新数组的空间等于nums1+nums2）的末尾；否则将nums2添加到新数组的末尾，然后逐个递减进行判断。
            else if (nums1[n1] >nums2[n2]) {
                nums1[i]=nums1[n1];
                n1--;
            }
            else {
                nums1[i]=nums2[n2];
                n2--;
            }
        }
        for (int num : nums1) {
            System.out.print ( num + " " );
        }
    }
    }

