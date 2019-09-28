package Code_04_DFS;

//https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/

import Code_99_LuanShua.TreeNode;

import java.util.ArrayList;
import java.util.List;

//have a look

public class Code_0129 {


    List<List<Integer>> result=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        getAll(root,new ArrayList<>());

        int val=0;
        for(List<Integer> list:result){
            int tt=0;
            while (!list.isEmpty()){
                tt=(tt*10)+list.get(0);
                list.remove(0);
            }
            val+=tt;
        }
        return val;
    }
    private void getAll(TreeNode node,List<Integer> item){
        if(node.left==null&&node.right==null){
            item.add(node.val);
            result.add(new ArrayList<>(item));
            item.remove(item.size()-1);
            return;
        }
        item.add(node.val);
        if(node.left!=null)
            getAll(node.left,item);
        if(node.right!=null)
            getAll(node.right,item);
        item.remove(item.size()-1);
    }
}
