package Code_00_LeetCode_ShuaTi.Code_01_LinkList;

//反转单链表
//https://leetcode-cn.com/problems/reverse-linked-list/


public class Code_0206 {

//    非递归写法
//    public ListNode reverseList(ListNode head) {
//        if(head==null||head.next==null)
//            return head;
//        ListNode pre=null;
//        ListNode cur=head;
//        while (cur!=null){
//            ListNode next=cur.next;
//            cur.next=pre;
//            pre=cur;
//            cur=next;
//        }
//        return pre;
//    }

//    递归写法
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null)
            return head;

        return reverse(head);
    }

    private ListNode  reverse(ListNode node){
        if(node.next==null)
            return node;


        ListNode newHead=reverse(node.next);

        ListNode temp=newHead;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;//将新节点的尾部置空，不然死循环

        return newHead;

    }


    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        Code_0206 code_0206=new Code_0206();
        ListNode ll=code_0206.reverseList(node1);


    }
}
