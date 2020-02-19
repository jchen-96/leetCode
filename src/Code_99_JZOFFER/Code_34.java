package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Code_34 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        dfs(root, result, item, sum);
        return result;
    }

    private void dfs(TreeNode node, List<List<Integer>> result, List<Integer> item, int sum) {
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                item.add(node.val);
                result.add(new ArrayList<>(item));
                item.remove(item.size() - 1);
            }
            return;
        }
        item.add(node.val);
        sum-=node.val;
        if(node.left!=null){
            dfs(node.left,result,item,sum);
        }
        if(node.right!=null){
            dfs(node.right,result,item,sum);
        }
        sum+=node.val;
        item.remove(item.size()-1);
    }
}
