package Code_99_JZOFFER;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_54 {

    private static int count=0;
    private static int target=0;
    private static int res=0;
    public int kthLargest(TreeNode root, int k) {
        target=k;
        count=0;
        res=0;

        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode node){
        if(node==null)
            return;
        inOrder(node.right);
        count++;
        if(count==target){
            res=node.val;
            return;
        }
        inOrder(node.left);
    }

}
