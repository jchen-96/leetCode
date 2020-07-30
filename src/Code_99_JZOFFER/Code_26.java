package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null)
            return false;
        if (A == null)
            return false;

        return isSubStructure(A.left, B) || isSubStructure(A.right, B) || isSame(A, B);

    }

    private boolean isSame(TreeNode node1, TreeNode node2) {
        if (node2 == null)
            return true;
        if (node1 == null)
            return false;
        return node1.val == node2.val && isSame(node1.left, node2.left) && isSame(node1.right, node2.right);
    }
}
