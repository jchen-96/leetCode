package Code_00_LeetCode_ShuaTi.Code_01_LinkList;
//复杂链表的复制
//https://leetcode-cn.com/problems/copy-list-with-random-pointer/

public class Code_0138 {
    public Node copyRandomList(Node pHead)
    {
        Node p=pHead;
        Node t=pHead;
        while(p!=null){
            Node q=new Node(p.val,null,null);
            q.next=p.next;
            p.next=q;
            p=q.next;
        }
        while(t!=null){
            Node q=t.next;
            if(t.random!=null)
                q.random=t.random.next;
            t=q.next;

        }
        Node s=new Node(0,null,null);
        Node s1=s;
        while(pHead!=null){
            Node  q=pHead.next;
            pHead.next=q.next;
            q.next=s.next;
            s.next=q;
            s=s.next;
            pHead=pHead.next;


        }
        return s1.next;

    }
}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};