package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode temp=p;
            p=q;
            q=temp;
        }
        return find(root,p,q);
    }
    private TreeNode find(TreeNode node,TreeNode small,TreeNode big){
        if(node==null)
            return node;
        if(node.val>=small.val&&node.val<=big.val)
            return node;
        if(node.val>big.val)
            return find(node.left,small,big);
        else
            return find(node.right,small,big);
    }
}
