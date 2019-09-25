package Code_99_LuanShua;


//https://leetcode-cn.com/problems/binary-search-tree-iterator/
//no need to read


import java.util.ArrayList;
import java.util.List;

public class Code_0173 {

}
class BSTIterator {
    List<TreeNode> list=new ArrayList<>();
    public BSTIterator(TreeNode root) {
        midOrder(root);
    }
    private void midOrder(TreeNode node){
        if(node==null){
            return;
        }
        midOrder(node.left);
        list.add(node);
        midOrder(node.right);
    }

    /** @return the next smallest number */
    public int next() {
        if(!list.isEmpty()){
            int temp=list.get(0).val;
            list.remove(0);
            return temp;
        }
        return -1;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !list.isEmpty();
    }
}