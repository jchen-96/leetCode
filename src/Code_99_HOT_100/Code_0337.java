package Code_99_HOT_100;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.HashMap;

public class Code_0337 {

    HashMap<TreeNode,Integer> mem=new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null)
            return 0;
        if(mem.containsKey(root))
            return mem.get(root);
        int money=root.val;
        if(root.left!=null){
            money+=rob(root.left.left)+rob(root.left.right);
        }
        if(root.right!=null)
            money+=rob(root.right.left)+rob(root.right.right);
        int val=Math.max(money,rob(root.left)+rob(root.right));
        mem.put(root,val);
        return val;
    }
}
