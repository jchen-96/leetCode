package Code_00_LeetCode_ShuaTi.Code_05_TreeAndGraph;

//https://leetcode-cn.com/problems/path-sum-ii/

import java.util.ArrayList;
import java.util.List;

public class Code_0113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> item=new ArrayList<>();
        generate2(sum,0,root,result,item);
        return result;

    }
    private void generate2(int sum,int res,TreeNode curNode,List<List<Integer>> result,List<Integer> item){
        if(curNode==null)
            return;
        res+=curNode.val;
        item.add(curNode.val);
        if(curNode.left==null&&curNode.right==null&&res==sum){
            result.add(new ArrayList<>(item));
        }
        if(curNode.left!=null){
            generate2(sum,res,curNode.left,result,item);
        }
        if(curNode.right!=null){
            generate2(sum,res,curNode.right,result,item);
        }
        item.remove(item.size()-1);
    }
}
