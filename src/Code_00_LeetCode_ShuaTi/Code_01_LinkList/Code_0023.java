package Code_00_LeetCode_ShuaTi.Code_01_LinkList;

//合并K个有序链表
//https://leetcode-cn.com/problems/merge-k-sorted-lists/

public class Code_0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length<=0){
            return null;
        }
        int len=lists.length;
        while (len>1){
            for(int i=0;i<(len+1)/2;i++){
                lists[i]=mergeTwoLists(lists[i],lists[i+(len+1)/2]);
            }
            len=(len+1)/2;

        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre_node=new ListNode(0);
        ListNode phead=pre_node;
        while (l1!=null||l2!=null){
            if(l1==null) {
                pre_node.next = l2;
                l2=l2.next;
                pre_node=pre_node.next;
                continue;
            }
            if(l2==null){
                pre_node.next=l1;
                l1=l1.next;
                pre_node=pre_node.next;
                continue;
            }
            if(l1.val<l2.val){
                pre_node.next=l1;
                l1=l1.next;
            }else{
                pre_node.next=l2;
                l2=l2.next;
            }
            pre_node=pre_node.next;

        }
        return phead.next;
    }
}
