package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_049{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        Node head=getLinkList(reader.readLine().trim().split(" "));
        removeK(head,k);
        printLinkList(head);
    }

    private static void removeK(Node head, int k) {
        if (head == null)
            return;
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (k > len)
            return;
        int index = len - k;
        if (index == 0) {
            head = head.next;
            return;
        }
        temp = head;
        int count = 0;
        while (count != index - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;

    }

    private static void printLinkList(Node head){
        StringBuilder sb=new StringBuilder();
        while (head!=null){
            sb.append(head.val+" ");
            head=head.next;
        }
        System.out.println(sb);
    }
    private static Node getLinkList(String[] s){
        Node phead=new Node(0);
        Node cur=phead;
        for(int i=0;i<s.length;i++){
            Node node=new Node(Integer.parseInt(s[i]));
            cur.next=node;
            cur=cur.next;
        }
        return phead.next;
    }
}

class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}


