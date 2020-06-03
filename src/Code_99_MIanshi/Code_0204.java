package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;


//no need to read
public class Code_0204 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        ListNode tmp;
        while (head != null) {
            tmp = head.next;
            if (dummy.next != null && head.val < x) {//头插
                head.next = dummy.next;
                dummy.next = head;
            } else {//尾插，包括一开始dummy.next == null的情况
                tail.next = head;
                head.next = null;
                tail = tail.next;
            }
            head = tmp;
        }
        return dummy.next;
    }
}
