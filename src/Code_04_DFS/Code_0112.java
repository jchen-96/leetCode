package Code_04_DFS;


//https://leetcode-cn.com/problems/path-sum/

//状态想清楚

import Code_99_LuanShua.TreeNode;

public class Code_0112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.right==null&&root.left==null&&root.val==sum)
            return true;
        return hasPathSum(root.left,sum-root.val)||
                hasPathSum(root.right,sum-root.val);

    }
}
