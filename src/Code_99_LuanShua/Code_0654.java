package Code_99_LuanShua;

//https://leetcode-cn.com/problems/maximum-binary-tree/

//easy

public class Code_0654 {
    class Solution {
        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return createNode(nums,0,nums.length-1);
        }
        private TreeNode createNode(int[] nums,int l,int r){
            if(l>r){
                return null;
            }
            if(l==r){
                return new TreeNode(nums[l]);
            }

            int maxIndex=l;
            for (int i = l; i <=r ; i++) {
                maxIndex=nums[i]>nums[maxIndex]?i:maxIndex;
            }
            TreeNode node=new TreeNode(nums[maxIndex]);
            node.left=createNode(nums,l,maxIndex-1);
            node.right=createNode(nums,maxIndex+1,r);
            return node;
        }
    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        this.val=x;
    }
}
