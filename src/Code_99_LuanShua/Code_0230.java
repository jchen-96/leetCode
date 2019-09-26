package Code_99_LuanShua;

//no need to read


import java.util.ArrayList;
import java.util.List;

public class Code_0230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        midOrder(root,list);
        return list.get(k-1);
    }
    private void midOrder(TreeNode node,List<Integer> list){
        if(node==null){
            return;
        }
        midOrder(node.left,list);
        list.add(node.val);
        midOrder(node.right,list);
    }
}

