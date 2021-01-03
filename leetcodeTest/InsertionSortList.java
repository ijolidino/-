package leetcodeTest;

public class InsertionSortList {

        public ListNode insertionSortList(ListNode head) {
            if (head == null||head.next==null) {
                return head;
            }
            ListNode a = new ListNode(0);
            a.next=head;
            ListNode LS=head,cu=head.next;
            while (cu!=null){
                if (LS.val<=cu.val){
                    LS= LS.next;
                }else {
                    ListNode pre=a;
                    while (pre.next.val <= cu.val){
                        pre=pre.next;
                    }
                        LS.next=cu.next;
                        cu.next=pre.next;
                        pre.next=cu;
                }
                cu=LS.next;
            }
            return a.next;
        }

    public static void main(String[] args) {
        InsertionSortList insertionSortList = new InsertionSortList();
        ListNode listNode = new ListNode(4);
        listNode.add(2);
        listNode.add(1);
        listNode.add(3);
//        listNode.add(3);
//        listNode.add(4);
//        listNode.add(1);
//        listNode.add(5);
        insertionSortList.insertionSortList(listNode);
        System.out.println(listNode.print(listNode));
    }
}
