package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_0206 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode midNode = findMidNode(head);
        ListNode secondHalfHead = reverseLinked(midNode.next);
        ListNode curr1 = head;
        ListNode curr2 = secondHalfHead;

        boolean palindrome = true;
        while (palindrome && curr2 != null) {
            if (curr1.val != curr2.val) palindrome = false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return palindrome;
    }

    /* 反转链表 */
    private ListNode reverseLinked(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }

    /* 快慢指针寻找中间节点 */
    private ListNode findMidNode(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        return low;
    }

}
