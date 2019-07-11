package Code_00_LeetCode_ShuaTi.Code_01_LinkList;
//https://leetcode-cn.com/problems/linked-list-cycle/
//环形链表1

public class Code_0141 {
    public boolean hasCycle(ListNode head) {
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
