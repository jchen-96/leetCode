package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        ListNode pa=headA;
        ListNode pb=headB;
        while (pa!=pb)
        {
            pa=pa==null?headB:pa.next;
            pb=pb==null?headA:pb.next;
        }
        return pa;
    }
}
