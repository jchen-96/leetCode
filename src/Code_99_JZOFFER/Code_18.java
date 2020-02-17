package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val)
            return head.next;
        ListNode target=head.next;
        ListNode pre=head;
        while (target!=null){
            if(target.val==val)
                break;
            target=target.next;
            pre=pre.next;
        }
        pre.next=target.next;
        return head;

    }
}
