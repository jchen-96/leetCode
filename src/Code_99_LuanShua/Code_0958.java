package Code_99_LuanShua;

import java.util.LinkedList;

public class Code_0958 {
    public boolean isCompleteTree(TreeNode root) {
        if(root==null)
            return true;
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.addLast(root);
        TreeNode l=null;
        TreeNode r=null;
        boolean isLeaf=false;
        while (!queue.isEmpty()){
            root=queue.pollFirst();
            l=root.left;
            r=root.left;
            if((l==null&&r!=null)||(isLeaf&&(r!=null||l!=null)))
                return false;
            if(l!=null)
                queue.addLast(l);
            if(r!=null)
                queue.addLast(r);
            else
                isLeaf=true;
        }
        return true;
    }
}
