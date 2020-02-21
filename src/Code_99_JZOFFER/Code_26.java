package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null||A==null)
            return false;
        if(A.val==B.val)
            return isSame(A,B);
        else
            return isSubStructure(A.left,B)||isSubStructure(A.right,B);

    }


    private boolean isSame(TreeNode node1, TreeNode node2) {
        if (node2 == null||node1==null)
            if(node2==null)
                return true;
            else
                return false;

        if (node1.val == node2.val)
            return isSame(node1.left, node2.left)&&isSame(node1.right,node2.right);
        else
            return false;
    }
}
