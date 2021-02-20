package leetcodeTest.middleHart;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: Testcode
 * @description: ListNode
 * @author: Fuwen
 * @create: 2021-02-20 13:06
 * 445. 两数相加 II
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 *
 *
 * 进阶：
 *
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 *
 *
 *
 * 示例：
 *
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
 **/
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Deque<Integer> l11 = new LinkedList<>();
        Deque<Integer> l22 = new LinkedList<>();
        while (l1!=null){
            l11.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            l22.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode node=null;

        while (!l11.isEmpty()||!l22.isEmpty()||carry!=0){
            int a=l11.isEmpty()? 0:l11.pop();
            int b=l22.isEmpty()? 0:l22.pop();
            int cur=a+b+carry;
            carry=cur/10;
            cur=cur%10;
            ListNode node1 = new ListNode(cur);
            node1.next=node;
            node=node1;
        }
        return node;
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        ListNode l2 = new ListNode(5);
        ListNode l11=l1;
        ListNode l22=l2;
        l1.next=new ListNode(2);
        l2.next=new ListNode(6);
        l1=l1.next;
        l2=l2.next;
        l1.next=new ListNode(4);
        l2.next=new ListNode(4);
        l1=l1.next;
        l2=l2.next;
        l1.next=new ListNode(3);
        new addTwoNumbers().addTwoNumbers(l11,l22);
    }
}
