package Code_99_HOT_100;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;
import org.w3c.dom.ls.LSInput;


//链表排序，递归
public class Code_0148 {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode fast=head.next,slow=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(temp);
        ListNode h=new ListNode(0);
        ListNode res=h;
        while (left!=null&&right!=null){
            if(left.val<right.val){
                h.next=left;
                left=left.next;
            }else{
                h.next=right;
                right=right.next;
            }
            h=h.next;
        }
        h.next=left!=null?left:right;

        return res.next;
    }
}
