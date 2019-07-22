package Code_00_LeetCode_ShuaTi.Code_01_LinkList;
//https://leetcode-cn.com/problems/reverse-linked-list-ii/

//把我关键节点，需要反转的链表的前一个节点和最后一个节点的下一个节点


// 可以好好看一下！！！！！！！！！！！！！！！！
// 反转从m到n的单链表
public class Code_0092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int change_len=n-m+1;
        ListNode pre_head=null;
        ListNode result=head;
        while (--m!=0&&head!=null){
            pre_head=head;
            head=head.next;
        }
        ListNode modify_list_tail=head;
        ListNode new_head=null;
        while (head!=null&&change_len!=0){
            ListNode next=head.next;
            head.next=new_head;
            new_head=head;
            head=next;
            change_len--;
        }
        modify_list_tail.next=head;
        if(pre_head!=null){
            pre_head.next=new_head;
        }else{
            result=new_head;
        }

        return result;
    }
}
