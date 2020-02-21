package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        int len2=0;
        ListNode temp=headA;
        while (temp!=null){
            temp=temp.next;
            len1++;
        }
        temp=headB;
        while (temp!=null){
            temp=temp.next;
            len2++;
        }
        if(len1>len2){
            int k=len1-len2;
            while (k>0){
                headA=headA.next;
                k--;
            }
        }else{
            int k=len2-len1;
            while (k>0){
                headB=headB.next;
                k--;
            }
        }
        while (headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
