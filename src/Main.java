import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<String>> styleAndsongs=new HashMap<>();
        Map<String,Integer> score=new HashMap<>();
        Map<String,String> types=new HashMap<>();
        String preSong="";
        String preInter="";
        while (reader.readLine()!="\n"){
            String[] s=reader.readLine().trim().split(" ");
            String kind=s[0];
            if(kind.equals("I")){
                if(styleAndsongs.get(s[2])==null){
                    List<String>  list=new ArrayList<>();
                    list.add(s[1]);
                    styleAndsongs.put(s[2],list);
                }else{
                    List<String> list=styleAndsongs.get(s[2]);
                    list.add(s[1]);
                }
            }else if(kind.equals("P")){
                String musicName=s[1];
                if(preSong.equals("")){
                    score.put(musicName,3);
                }else if(types.get(preSong).equals(types.get(musicName))){
                    //所有的都加+1
                }else{
                    if(score.get(musicName)==null){
                        score.put(musicName,3);
                    }else{
                        score.put(musicName,score.get(musicName)+3);
                    }
                }
                preSong=musicName;
            }

        }
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

