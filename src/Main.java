import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=reader.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int[] arr=new int[n];
        s=reader.readLine().trim().split(" ");

        for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(getV(arr,m));
    }
    private static int getV(int[] coins,int sum){
        return 0;
    }

}
















//public class Main{
//    public static void main(String[] args) throws Exception{
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        reader.readLine();
//        Node head=getLinkList(reader.readLine().trim().split(" "));
//        String[] s=reader.readLine().trim().split(" ");
//        int left=Integer.parseInt(s[0]);
//        int right=Integer.parseInt(s[1]);
//
//        head=inverse(head,left,right);
//        printLinkList(head);
//    }
//
//    public static Node inverse(Node head, int left, int right) {
//        if (head == null || left == right) {
//            return head;
//        }
//        Node cur = head;
//        //记录左拼接点
//        Node leftNode = null;
//        int count = 1;
//        while (count < left) {
//            count++;
//            leftNode = cur;
//            cur = cur.next;
//        }
//        //记录拼接点
//        Node lastNode = cur;
//        //开始反转
//        Node pre = null;
//        Node next = null;
//        while (count <= right) {
//            next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//            count++;
//        }
//        if(leftNode == null){
//            head = pre;
//        }else {
//            leftNode.next = pre;
//        }
//        lastNode.next = next;
//        return head;
//    }
//
//    private static void printLinkList(Node head){
//        StringBuilder sb=new StringBuilder();
//        while (head!=null){
//            sb.append(head.val+" ");
//            head=head.next;
//        }
//        System.out.println(sb);
//    }
//    private static Node getLinkList(String[] s){
//        Node phead=new Node(0);
//        Node cur=phead;
//        for(int i=0;i<s.length;i++){
//            Node node=new Node(Integer.parseInt(s[i]));
//            cur.next=node;
//            cur=cur.next;
//        }
//        return phead.next;
//    }
//}
//
//class Node{
//    public int val;
//    public Node next;
//
//    public Node(int val) {
//        this.val = val;
//    }
//}

