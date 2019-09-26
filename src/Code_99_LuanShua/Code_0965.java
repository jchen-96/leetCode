package Code_99_LuanShua;

public class Code_0965 {
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        return isSame(root,val);
    }
    private boolean isSame(TreeNode node,int val){
        if(node==null)
            return true;
        if(node.val!=val)
            return false;
        return isSame(node.left,val)&&isSame(node.right,val);
    }
}
