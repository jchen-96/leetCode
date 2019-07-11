package Code_00_LeetCode_ShuaTi.Code_01_LinkList;

//两两交换链表中的节点
//https://leetcode-cn.com/problems/swap-nodes-in-pairs/

public class Code_0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode phead=new ListNode(0);
        phead.next=head;
        ListNode pre=phead;
        while(pre.next!=null&&pre.next.next!=null){
            ListNode node1=pre.next;
            ListNode node2=node1.next;
            ListNode next=node2.next;

            node1.next=next;
            node2.next=node1;
            pre.next=node2;

            pre=node1;
        }

        return phead.next;
    }
}
