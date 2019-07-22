package Code_00_LeetCode_ShuaTi.Code_01_LinkList;
//分隔链表
//https://leetcode-cn.com/problems/partition-list/

//easy  注意最后两个指针的尾部都要处理

public class Code_0086 {
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode big=new ListNode(0);
        ListNode p1=small;
        ListNode p2=big;
        while (head!=null){
            if(head.val<x){
                p1.next=head;
                p1=p1.next;
            }else{
                p2.next=head;
                p2=p2.next;
            }
            head=head.next;
        }

        p2.next=null;//attention
        p1.next=big.next;
        return small.next;
    }

}
