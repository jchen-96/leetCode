package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_0412 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
        return paths(root,sum)+
                pathSum(root.left,sum)+
                pathSum(root.right,sum);
    }
    private int paths(TreeNode node,int sum){
        if(node==null)
            return 0;
        int res=0;
        if(node.val==sum){
            res+=1;
        }
        res+=paths(node.left,sum-node.val);
        res+=paths(node.right,sum-node.val);
        return res;
    }
}
