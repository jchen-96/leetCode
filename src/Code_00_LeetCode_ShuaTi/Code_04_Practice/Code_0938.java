package Code_00_LeetCode_ShuaTi.Code_04_Practice;

//https://leetcode-cn.com/problems/range-sum-of-bst/

//给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
//二叉搜索树保证具有唯一的值。

// too easy no need to read

public class Code_0938 {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.val>=L&&root.val<=R) {
            count += root.val;
            count += rangeSumBST(root.left, L, R);
            count += rangeSumBST(root.right, L, R);
        }else if(root.val<L){
            count+=rangeSumBST(root.right,L,R);
        }else{
            count+=rangeSumBST(root.left,L,R);
        }

        return count;
    }

}
