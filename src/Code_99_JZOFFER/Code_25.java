package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode node=head;

        while (l1!=null||l2!=null){
            if(l1==null){
                node.next=l2;
                l2=l2.next;
            }else if(l2==null){
                node.next=l1;
                l1=l1.next;
            }
            if(l1!=null&&l2!=null){
                if(l1.val<l2.val){
                    node.next=l1;
                    l1=l1.next;
                }else {
                    node.next=l2;
                    l2=l2.next;
                }
            }
            node=node.next;
        }
        return head.next;
    }
}
