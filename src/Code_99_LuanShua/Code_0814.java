package Code_99_LuanShua;



//https://leetcode-cn.com/problems/binary-tree-pruning/
//read 巧用后续遍历

//https://leetcode-cn.com/problems/binary-tree-pruning/
public class Code_0814 {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null)
            return null;
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        if(root.val==0&&root.left==null&&root.right==null)
            return null;
        return root;
    }
}
