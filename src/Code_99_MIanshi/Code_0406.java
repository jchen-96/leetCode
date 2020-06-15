package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_0406 {
    TreeNode pre = null, result = null;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;
        inorderSuccessor(root.left, p);
        if (pre == p)
            result = root;
        pre = root;

        inorderSuccessor(root.right, p);
        return result;
    }
}
