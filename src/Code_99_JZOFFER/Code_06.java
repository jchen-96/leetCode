package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_06 {
    public int[] reversePrint(ListNode head) {
        if(head==null)
            return new int[0];
        ListNode temp=head;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        int[] res=new int[count];
        temp=head;
        int len=count-1;
        while (len>=0){
            res[len]=temp.val;
            temp=temp.next;
            len--;
        }
        return res;
    }
}
