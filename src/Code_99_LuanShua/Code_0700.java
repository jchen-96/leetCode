package Code_99_LuanShua;

//https://leetcode-cn.com/problems/search-in-a-binary-search-tree/

//no need to read

public class Code_0700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        if(root.val>val)
            return searchBST(root.left,val);
        if(root.val<val)
            return searchBST(root.right,val);
        return null;
    }
}
