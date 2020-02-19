package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorTree(root.left);
        mirrorTree(root.right);

        return root;
    }
}
