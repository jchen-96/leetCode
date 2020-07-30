package Code_99_LuanShua;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_0144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();

        if(root==null)
            return result;

        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode cur=stack.peek();
            result.add(cur.val);
            if(cur.right!=null){
                stack.push(root.right);
            }
            if(cur.left!=null){
                stack.push(root.left);
            }
            stack.pop();
        }
        return result;
    }
}
