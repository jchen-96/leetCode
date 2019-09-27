package Code_04_DFS;

//https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/\
// 看一下

import Code_99_LuanShua.TreeNode;

public class Code_0111 {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        int min_depth=Integer.MAX_VALUE;
        if(root.left!=null){
            min_depth=Math.min(min_depth,minDepth(root.left));
        }
        if(root.right!=null)
            min_depth=Math.min(min_depth,minDepth(root.right));
        return min_depth+1;
    }
}
