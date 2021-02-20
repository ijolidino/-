package leetcodeTest.hard;


import java.util.Arrays;

/**
 * @program: Testcode
 * @description: 合并链表
 * @author: Fuwen
 * @create: 2021-02-20 14:03
 * 23. 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 *
 *
 * 示例 1：
 *
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 * 示例 2：
 *
 * 输入：lists = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：lists = [[]]
 * 输出：[]
 **/
public class mergeKListsLee {
    public ListNode mergeKLists(ListNode[] lists) {
        int len=len(lists);
        int[] ints = new int[len];
        int count=0;
        for (int i = 0; i < lists.length; i++) {
            ListNode l=lists[i];
            while (l!=null){
                ints[count]=l.val;
                l=l.next;
                count++;
            }
        }
        Arrays.sort(ints);
        ListNode dummyNode = new ListNode(-1);
        ListNode curr=dummyNode;
        for (int i = 0; i < len; i++) {
            dummyNode.next=new ListNode(ints[i]);
            dummyNode=dummyNode.next;
        }
        return curr.next;
    }

    private int len(ListNode[] nodes){
        int len=0;
        for (int i = 0; i < nodes.length; i++) {
            ListNode l=nodes[i];
            while (l!=null){
                len++;
                l=l.next;
            }
        }
        return len;
    }
}
