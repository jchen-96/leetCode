package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_0404 {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(Math.abs(depth(root.left)-depth(root.right))<=1)
            if(isBalanced(root.left)&&isBalanced(root.right))
                return true;
        return false;
    }
    private int depth(TreeNode node){
        if(node==null)
            return 0;
        return Math.max(depth(node.left),depth(node.right))+1;
    }
}
