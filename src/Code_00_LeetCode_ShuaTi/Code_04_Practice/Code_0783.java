package Code_00_LeetCode_ShuaTi.Code_04_Practice;

//https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/

import java.util.ArrayList;
import java.util.List;

//一个中序遍历就好了，另外注意值传递和引用传递

public class Code_0783 {
    public int minDiffInBST(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        int[] min=new int[]{Integer.MAX_VALUE};
        midTraverse(root,result,min);
        return min[0];

    }
    private void midTraverse(TreeNode node,List<Integer> result,int[] min){
        if(node==null)
            return;
        midTraverse(node.left,result,min);
        if(result.size()==0){
            result.add(node.val);
        }else{
            int diff=Math.abs(node.val-result.get(result.size()-1));
            min[0]=Math.min(diff,min[0]);
            result.add(node.val);
        }
        midTraverse(node.right,result,min);

    }
}
