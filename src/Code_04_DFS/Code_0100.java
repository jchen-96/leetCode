package Code_04_DFS;

import Code_99_LuanShua.TreeNode;

//no need to read

public class Code_0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null&&q!=null)
            return false;
        if(p!=null&&q==null)
            return false;
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
