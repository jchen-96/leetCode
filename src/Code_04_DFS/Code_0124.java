package Code_04_DFS;

//hard
//https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/


import Code_99_LuanShua.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Code_0124 {
    int max_sum=Integer.MIN_VALUE;

    private int max_gain(TreeNode node){
        if(node==null)
            return 0;
        int left_gain=Math.max(max_gain(node.left),0);
        int right_gian=Math.max(max_gain(node.right),0);
        int new_price=node.val+left_gain+right_gian;
        max_sum=Math.max(max_sum,new_price);
        return node.val+Math.max(left_gain,right_gian);
    }

    public int maxPathSum(TreeNode root){
        max_gain(root);
        return max_sum;
    }
}

