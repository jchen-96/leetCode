package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_0205 {

    //没有必要转换成数，直接链表相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode sumList = new ListNode(0);
        ListNode tail = sumList;

        while(l1 != null || l2 != null){
            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);

            add = s / 10;
            tail.next = new ListNode(s % 10);
            tail = tail.next;
        }
        if(add != 0)
            tail.next = new ListNode(add);
        return sumList.next;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(8);
        node1.next=node2;
        ListNode node3=new ListNode(0);

        System.out.println(new Code_0205().addTwoNumbers(node1,node3));

    }
}
