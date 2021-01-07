package leetcodeTest.Easy;

import leetcodeTest.Easy.ListNode;

/**
 * Create by Fuwen on 2021/1/7
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 *
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);//创建一个链表，-1表示这个是空链表
        ListNode curr=listNode;//用curr指向这个链表的当前节点
        while (l1!=null&&l2!=null){//当两个链表为空的时候退出循环
            if(l1.val<=l2.val){
                curr.next=l1;//如果l1节点的当前链表的值小于l2的则让curr.next指向它
                l1=l1.next;//指向下一个节点
            }else {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=l1==null?l2:l1;//curr.next指向不为空的链表
        return listNode.next;
    }

}
