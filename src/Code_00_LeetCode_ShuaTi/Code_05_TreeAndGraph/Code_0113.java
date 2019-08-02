package Code_00_LeetCode_ShuaTi.Code_05_TreeAndGraph;

//https://leetcode-cn.com/problems/path-sum-ii/

import java.util.ArrayList;
import java.util.List;

public class Code_0113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> item=new ArrayList<>();
        TreeNode curNode=root;
        int[] res=new int[1];
        generate(sum,res,curNode,result,item);
        return result;

    }
    private void generate(int sum,int[] res,TreeNode curNode,List<List<Integer>> result,List<Integer> item){
        if(curNode==null){
            return;
        }
        res[0]+=curNode.val;
        item.add(curNode.val);
        if(res[0]==sum&&curNode.left==null&&curNode.right==null){
            result.add(new ArrayList<>(item));
        }
        generate(sum,res,curNode.left,result,item);
        generate(sum,res,curNode.right,result,item);
        res[0]-=curNode.val;
        item.remove(item.size()-1);

    }
}
