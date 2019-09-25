package Code_99_LuanShua;
//https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/


import java.util.ArrayList;
import java.util.List;

//no need to read ,后序遍历的非递归形式要掌握
public class Code_0590 {
    List<Integer> result=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null)
            return result;
        for(Node node:root.children){
            postorder(node);
        }
        result.add(root.val);
        return result;
    }
}
