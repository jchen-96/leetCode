package Code_04_DFS;

//https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node-ii/
//层序遍历

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_0117 {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Node> list=new ArrayList<>();
            int count=queue.size();
            while (count>0){
                Node node=queue.poll();
                list.add(node);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                count--;
            }
            for (int i = 0; i < list.size()-1; i++) {
                list.get(i).next=list.get(i+1);
            }
        }
        return root;
    }
}

