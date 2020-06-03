package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Code_0201 {
    public int kthToLast(ListNode head, int k) {
        ListNode p = head;
        for(int i=0;i<k;i++){
            p = p.next;
        }

        while(p != null){
            p = p.next;
            head = head.next;
        }

        return head.val;
    }
}
