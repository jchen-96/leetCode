package Code_04_DFS;

//要保证全局是二叉树，还要关注具体的值，不能只关注子树

//https://leetcode-cn.com/problems/validate-binary-search-tree/

import Code_99_LuanShua.TreeNode;

import java.util.Stack;

public class Code_0098 {
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
    private boolean isValid(TreeNode node,Integer lower,Integer upper){
        if(node==null)
            return true;
        if(lower!=null&&node.val<=lower) return false;
        if(upper!=null&&node.val>=upper) return false;

        if(!isValid(node.right,node.val,upper))
            return false;
        if(!isValid(node.left,lower,node.val))
            return false;
        return true;
    }

//    非递归形式
    public boolean isV(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        double inorder=-Double.MAX_VALUE;

        while (!stack.empty()||root!=null){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }

            root=stack.pop();
            if(root.val<=inorder) return false;
            inorder=root.val;
            root=root.right;
        }
        return true;
    }



}
