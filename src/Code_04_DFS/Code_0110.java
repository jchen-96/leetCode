package Code_04_DFS;

//https://leetcode-cn.com/problems/balanced-binary-tree/

//写的出来但是不好理解,递归

import Code_99_LuanShua.TreeNode;

public class Code_0110 {
    public boolean isBalanced(TreeNode root) {
        return depth(root)!=-1;
    }
    private int depth(TreeNode root){
        if(root==null)
            return 0;
        int left=depth(root.left);
        if(left==-1)
            return -1;
        int right=depth(root.right);
        if(right==-1)
            return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}
