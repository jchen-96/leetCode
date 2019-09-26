package Code_04_DFS;

//要保证全局是二叉树，还要关注具体的值，不能只关注子树

import Code_99_LuanShua.TreeNode;

public class Code_0098 {
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        boolean left=true;
        boolean right=true;
        if(root.left!=null)
            if (root.val>root.left.val)
                left=isValidBST(root.left);
            else
                return false;
        if(root.right!=null)
            if(root.val<root.right.val)
                right=isValidBST(root.right);
            else
                return false;

        return left&&right;

    }

}
