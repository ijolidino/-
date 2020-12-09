public class SortList {


        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }


            ListNode fastNode = head;
            ListNode slowHead = head;
            while (fastNode.next != null && fastNode.next.next != null) {
                slowHead = slowHead.next;
                fastNode = fastNode.next.next;
            }

            ListNode midNode = slowHead.next;
            slowHead.next = null;
            ListNode leftHead = sortList(head);
            ListNode rightHead = sortList(midNode);
            return merge(leftHead, rightHead);
        }

        private ListNode merge(ListNode leftHead, ListNode rightHead) {
            if (leftHead == null) {
                return rightHead;
            }
            if (rightHead == null) {
                return leftHead;
            }
            if (leftHead.val < rightHead.val) {
                leftHead.next = merge(leftHead.next, rightHead);
                return leftHead;
            } else {
                rightHead.next = merge(leftHead, rightHead.next);
                return rightHead;
            }
        }


}
