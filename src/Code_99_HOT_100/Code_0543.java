package Code_99_HOT_100;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_0543 {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        depth(root);
        return res;
    }
    private int depth(TreeNode node){
        if(node==null)
            return 0;
        int left=depth(node.left);
        int right=depth(node.right);
        res=Math.max(left+right,res);
        return 1+Math.max(left,right);
    }
}
