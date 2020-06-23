package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_107{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        Node head1=getLinkList(reader.readLine().trim().split(" "));
        reader.readLine();
        Node head2=getLinkList(reader.readLine().trim().split(" "));
        head1=reverse(head1);
        head2=reverse(head2);
        printLinkList(head1);
        printLinkList(head2);

    }

    private static Node reverse(Node head){
        if(head==null||head.next==null)
            return head;
        Node pre=null;
        while (head!=null){
            Node next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
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



