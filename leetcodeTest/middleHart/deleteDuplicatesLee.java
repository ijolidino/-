package leetcodeTest.middleHart;

/**
 * @program: Testcode
 * @description: 删除重复的链表节点
 * @author: Fuwen
 * @create: 2021-02-20 14:34
 * 82. 删除排序链表中的重复元素 II
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 *
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 **/
public class deleteDuplicatesLee {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            if (head.val == head.next.val) {
                while (head != null && head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                return deleteDuplicates(head.next);
            } else {
                head.next = deleteDuplicates(head.next);
                return head;
            }
        }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11=l1;
//        l1.next=new ListNode(1);
//        l1=l1.next;
//        l1.next=new ListNode(1);
//        l1=l1.next;
        l1.next=new ListNode(4);
        l1=l1.next;
        l1.next=new ListNode(4);
        l1=l1.next;
        l1.next=new ListNode(5);
        l1=l1.next;
        l1.next=new ListNode(5);
        l1=l1.next;
        l1.next=new ListNode(5);
        new deleteDuplicatesLee().deleteDuplicates(l11);
    }
}
