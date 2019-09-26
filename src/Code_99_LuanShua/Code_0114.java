package Code_99_LuanShua;

//https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/

//no need to read,hava a look

public class Code_0114 {
    TreeNode last=null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        // 前序：注意更新last节点，包括更新左右子树
        if (last != null) {
            last.left = null;
            last.right = root;
        }
        last = root;
        // 前序：注意备份右子节点，规避下一节点篡改
        TreeNode copyRight = root.right;
        flatten(root.left);
        flatten(copyRight);
    }
}

