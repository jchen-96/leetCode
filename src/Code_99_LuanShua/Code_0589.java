package Code_99_LuanShua;

//https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/


//no need to read,要掌握前后中三种遍历的非递归形式

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_0589 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null)
            return result;
        result.add(root.val);
        for (Node node : root.children) {
            preorder(node);
        }
        return result;
    }
}
