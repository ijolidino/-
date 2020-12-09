class addTowNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode head=listNode;
        int carry=0;
        while(l1!=null || l2!=null){
            int x=(l1 ==null) ? 0: l1.val;
            int y=(l2==null)? 0: l2.val;
            int sum=carry+x+y;
            carry=sum/10;
            head.next=new ListNode(sum%10);
            head=head.next;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        if (carry>0){
            head.next=new ListNode(carry);
        }
        return listNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){val =x;}
        public static String print(ListNode l){
            StringBuilder stringBuilder = new StringBuilder();
            while (l!=null){
                stringBuilder.append(l.val);
                l=l.next;
            }
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(7);
        l1.next=new ListNode(7);
        l2.next=new ListNode(3);
        System.out.println(ListNode.print(addTwoNumbers(l1,l2)));


    }
}
