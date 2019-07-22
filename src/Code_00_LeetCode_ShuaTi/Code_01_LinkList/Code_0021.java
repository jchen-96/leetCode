package Code_00_LeetCode_ShuaTi.Code_01_LinkList;

//合并两个有序链表
//https://leetcode-cn.com/problems/merge-two-sorted-lists/

public class Code_0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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

    public static void main(String[] args) {
        ListNode node1=new ListNode(-9);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(5);
        ListNode node4=new ListNode(7);
        node1.next=node2;
        node3.next=node4;

        Code_0021 code_0021=new Code_0021();
        ListNode res=code_0021.mergeTwoLists(node1,node3);

    }
}
