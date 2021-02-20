package leetcodeTest.middleHart;


/**
 * @program: Testcode
 * @description: deleteNode
 * @author: Fuwen
 * @create: 2021-02-20 12:30
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 **/
public class removeNthFromEnd {

        public ListNode removeNthFromEnd(ListNode head, int n) {
            // 先获得链表的长度
            int len = LenOfListNode(head);

            ListNode dummyNode = new ListNode(-1);
            dummyNode.next = head;
            ListNode curNode = dummyNode;
            // 从虚拟头结点开始走 len - n 步
            for (int i = 0; i < len - n; i++) {
                curNode = curNode.next;
            }

            // 删除结点，先声明待删除结点
            ListNode deleteNode = curNode.next;
            // 再修改指针指向
            curNode.next = deleteNode.next;
            // 删除结点的 next 指针释放引用
            deleteNode.next = null;
            return dummyNode.next;
        }

        private int LenOfListNode(ListNode head){
            int len=0;
            while (head!=null){
                len++;
                head=head.next;
            }
            return len;
        }

}
