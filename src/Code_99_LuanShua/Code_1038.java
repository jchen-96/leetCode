package Code_99_LuanShua;

//no need to read
//https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/solution/dfsfan-zhuan-zhong-xu-bian-li-java-by-zi-mo-10/

public class Code_1038 {
    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }

    int sum = 0;// 记录每个节点的右边的所有节点和，即原树中大于 node.val 的值之和
    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.right);// 先访问所有大于root的节点
        root.val += sum;// 赋值给当前节点
        sum = root.val;// 保存更大和
        dfs(root.left);// 后访问小于root的节点
    }
}
