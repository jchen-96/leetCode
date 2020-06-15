package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_0405 {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return isValidBSThelp(root.left,Long.MIN_VALUE,root.val)&&isValidBSThelp(root.right,root.val,Long.MAX_VALUE);
    }
    private boolean isValidBSThelp(TreeNode root, long min, long max){
        if(root==null) return true;
        if(root.val<=min||root.val>=max) return false;
        boolean left = isValidBSThelp(root.left,min,root.val);
        boolean right = isValidBSThelp(root.right,root.val,max);
        return left && right;
    }
}
