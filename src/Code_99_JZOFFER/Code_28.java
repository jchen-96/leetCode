package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;


//如果一棵二叉树和它的镜像一样，那么它是对称的.也就是一个二叉树和自己互为镜像
public class Code_28 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null)
            return true;
        if(node1==null||node2==null)
            return false;
        return node1.val==node2.val&&isMirror(node1.left,node2.right)&&isMirror(node2.left,node1.right);
    }
}
