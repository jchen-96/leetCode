package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

public class Code_0402 {
    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        this.nums = nums;
        int len = nums.length;
        return helper(0,len - 1);
    }

    private TreeNode helper(int s, int e){
        if(s == e){
            return new TreeNode(nums[e]);
        }
        if(s > e){
            return null;
        }
        int mid = s + ((e - s) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(s, mid - 1);
        root.right = helper(mid + 1, e);
        return root;
    }
}
