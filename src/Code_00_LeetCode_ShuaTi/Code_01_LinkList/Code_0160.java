package Code_00_LeetCode_ShuaTi.Code_01_LinkList;

//求两个链表的交点
//https://leetcode-cn.com/problems/intersection-of-two-linked-lists/

public class Code_0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(!hasIntersection(headA,headB))
            return null;
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
        ListNode longer=null;
        ListNode shorter=null;
        int k=0;
        if(len1>=len2){
            longer=headA;
            shorter=headB;
            k=len1-len2;
        }else{
            longer=headB;
            shorter=headA;
            k=len2-len1;
        }
        while (k>0){
            longer=longer.next;
            k--;
        }
        while (longer!=shorter){
            longer=longer.next;
            shorter=shorter.next;
        }
        return longer;


    }

    private boolean hasIntersection(ListNode headA,ListNode headB){
        ListNode h1=headA;
        ListNode h2=headB;
        if(headA==null||headB==null)
            return false;

        while (h1.next!=null||h2.next!=null){
            h1=h1.next==null?h1:h1.next;
            h2=h2.next==null?h2:h2.next;
        }
        return h1==h2;
    }
}
