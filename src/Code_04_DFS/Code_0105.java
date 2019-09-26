package Code_04_DFS;

//https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

//简单的递归思路,边界条件控制

import Code_99_LuanShua.TreeNode;

public class Code_0105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createNode(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode createNode(int[] preorder,int pre_start,int pre_end,int[] inorder,int in_start,int in_end){
        if(pre_start==pre_end)
            return new TreeNode(preorder[pre_start]);
        if(pre_start>pre_end)
            return null;

        int value=preorder[pre_start];
        TreeNode node=new TreeNode(value);
        int index=0;
        for(int i=in_start;i<=in_end;i++){
            if(inorder[i]==value){
                index=i;
                break;
            }
        }
        int pre_len=index-in_start;

        node.left=createNode(preorder,pre_start+1,pre_start+pre_len,inorder,in_start,index-1);
        node.right=createNode(preorder,pre_start+pre_len+1,pre_end,inorder,index+1,in_end);
        return node;
    }
}
