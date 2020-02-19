package Code_99_JZOFFER;


public class Code_35 {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node temp=head;
        while (temp!=null){
            Node node=new Node(temp.val);
            node.next=temp.next;
            temp.next=node;
            temp=temp.next.next;
        }
        temp=head;
        while (temp!=null){
            if(temp.random!=null)
                temp.next.random=temp.random.next;
            temp=temp.next.next;
        }
        Node newHead=head.next;
        temp=newHead;
        Node temp2=head;
        while (temp!=null){
            temp2.next=temp.next;
            if(temp.next==null)
                break;
            temp.next=temp.next.next;
            temp=temp.next;
            temp2=temp2.next;
        }
        return newHead;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
