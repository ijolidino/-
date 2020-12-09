public class ListNodeReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode curr=head;
        ListNode pre=null;
        while (curr!=null){
            ListNode dum=curr.next;
            curr.next=pre;
            pre=curr;
            curr=dum;
        }

        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode.next=listNode1;
        listNode1.next=listNode2;
//        while (listNode!=null){
//            System.out.println(listNode.val);
//            listNode=listNode.next;
//        }
        new ListNodeReverseList().ReverseList(listNode);

    }
}
