package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null)
            return head;
        int len=0;
        ListNode  temp=head;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
        int remain=len-k;
        if(remain<0)
            return null;
        while (remain>0){
            head=head.next;
            remain--;
        }
        return head;
    }
}
