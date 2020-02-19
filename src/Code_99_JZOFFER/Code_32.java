package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_32 {
    public int[] levelOrder(TreeNode root) {
        if(root==null)
            return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode  node=queue.remove();
            list.add(node.val);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++)
            res[i]=list.get(i);
        return res;
    }

}
