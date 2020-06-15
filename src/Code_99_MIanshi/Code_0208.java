package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_0208 {
    public ListNode detectCycle(ListNode head) {
        //快慢指针

        if(head != null && head.next != null) {

            ListNode fast = head;

            ListNode slow = head;

            fast = fast.next.next;
            slow = slow.next;
            while (fast != slow && fast != null && slow != null) {
                if(fast.next == null) {
                    return null;
                }
                fast = fast.next.next;
                slow = slow.next;
            }

            if(fast != null && slow != null) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }

                return fast;
            }

        }

        return null;
    }
}
