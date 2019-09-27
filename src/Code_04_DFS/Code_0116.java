package Code_04_DFS;

//https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
//二叉树的层序遍历

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_0116 {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count=queue.size();
            List<Node> list=new ArrayList<>();
            while (count>0){
                Node p=queue.poll();
                list.add(p);
                if(p.left!=null)
                    queue.add(p.left);
                if(p.right!=null)
                    queue.add(p.right);
                count--;
            }
            for(int i=0;i<list.size()-1;i++){
                list.get(i).next=list.get(i+1);
            }
        }
        return root;

    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};