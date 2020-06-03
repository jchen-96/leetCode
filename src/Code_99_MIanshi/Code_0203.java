package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_0203 {
    public void deleteNode(ListNode node) {
        if(node.next==null){
            node=null;
        }
        else{
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
