package Code_00_LeetCode_ShuaTi.Code_01_LinkList;

//https://leetcode-cn.com/problems/linked-list-cycle-ii/
//链表求环2

public class Code_0142 {
    public ListNode detectCycle(ListNode head) {
        if(!hasCircle(head))
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&fast.next.next!=null&&slow.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                break;
        }
        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
    private boolean hasCircle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&fast.next.next!=null&&slow.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
}
