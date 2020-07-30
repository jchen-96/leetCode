package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//并不是求树的直径。
public class Code_179 {

    private static ReturnType getD(Node d){
        if(d==null)
            return new ReturnType(0,0);
        ReturnType left=getD(d.left);
        ReturnType right=getD(d.right);

        int height=Math.max(left.height,right.height)+1;
        int maxDistance=Math.max(left.height+right.height+1,Math.max(left.maxDistance,right.maxDistance));
        return new ReturnType(maxDistance,height);

    }


    static class ReturnType{
        int maxDistance;
        int height;

        public ReturnType(int maxDistance, int height) {
            this.maxDistance = maxDistance;
            this.height = height;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int nodeNumber = Integer.parseInt(info[0]);
        Node head = createBinaryTree(br);
        System.out.println(getD(head).maxDistance);

    }
    public static Node createBinaryTree(BufferedReader br) throws IOException{
        String[] nodesValue = br.readLine().split(" ");
        int value =Integer.parseInt(nodesValue[0]);
        int leftValue = Integer.parseInt(nodesValue[1]);
        int rightValue = Integer.parseInt(nodesValue[2]);

        Node node = new Node(value);

        if(leftValue != 0){
            node.left = createBinaryTree(br);
        }
        if(rightValue != 0){
            node.right = createBinaryTree(br);
        }

        return node;

    }
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
}
