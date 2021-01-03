package leetcodeTest;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by Fuwen on 2021/1/3
 * 86. 分隔链表
 * 给你一个链表和一个特定值 x ，请你对链表进行分隔，使得所有小于 x 的节点都出现在大于或等于 x 的节点之前。
 *
 * 你应当保留两个分区中每个节点的初始相对位置。
 *
 *
 *
 * 示例：
 *
 * 输入：head = 1->4->3->2->5->2, x = 3
 * 输出：1->2->2->4->3->5
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head==null||head.next==null){
            return head;
        }
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        boolean b=false;
        while (head!=null){
           if (head.val<x&&!b){
               arrayDeque.addLast(head.val);
           }
           else if (head.val>=x&&!b){
               arrayDeque.addLast(head.val);
               b=true;
           }
           else if (head.val<x&&b){
               while (!arrayDeque.isEmpty()&&arrayDeque.peekLast()> head.val&&arrayDeque.peekLast()>=x){
                   deque.addLast(arrayDeque.removeLast());
               }
               arrayDeque.addLast(head.val);
               while (!deque.isEmpty()){
                   arrayDeque.addLast(deque.removeLast());
               }
           }
           else if (head.val>=x&&b){
               arrayDeque.addLast(head.val);
           }
           head=head.next;
        }
        ListNode listNode =new ListNode(arrayDeque.removeFirst());
        ListNode nextNode;
        nextNode =listNode;
        while (!arrayDeque.isEmpty()){
           ListNode l=new ListNode(arrayDeque.removeFirst());
            nextNode.next=l;
            nextNode=nextNode.next;
        }
        nextNode=listNode;
        return nextNode;
    }

    public static void main(String[] args) {
//        ListNode listNode = new ListNode(1);
//        listNode.add(4);
//        listNode.add(3);
//        listNode.add(2);
//        listNode.add(5);
//        listNode.add(2);
//        listNode.add(3);
//       while (listNode!=null){
//            System.out.print(listNode.val+",");
//            listNode=listNode.next;
//        }
        ListNode listNode = new ListNode(2);
        listNode.add(3);
        listNode.add(1);
        ListNode listNode1 = new PartitionList().partition(listNode, 3);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }
    }
}
