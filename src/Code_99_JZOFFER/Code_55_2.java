package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_55_2 {
    public boolean isBalanced(TreeNode root) {
        return depth(root)!=-1;
    }
    private int depth(TreeNode node){
        if(node==null)
            return 0;
        int left=depth(node.left);
        if(left==-1)
            return -1;
        int right=depth(node.right);
        if(right==-1)
            return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}
