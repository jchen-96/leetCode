package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.*;

public class Code_32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode last=root;
        TreeNode nlast=null;
        queue.add(root);
        int count=0;
        while (!queue.isEmpty()){
            TreeNode t=queue.remove();
            res.add(t.val);
            if(t.left!=null){
                queue.add(t.left);
                nlast=t.left;
            }
            if(t.right!=null){
                queue.add(t.right);
                nlast=t.right;
            }
            if(t==last){
                if(count%2==0)
                    result.add(new ArrayList<>(res));
                else {
                    Collections.reverse(res);
                    result.add(new ArrayList<Integer>(res));
                }
                count++;
                res.clear();
                last=nlast;
            }
        }
        return result;
    }
}
