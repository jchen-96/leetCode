package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_24 {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode node=reverseList(head.next);

        head.next.next=head;
        head.next=null;

        return node;
    }
}
