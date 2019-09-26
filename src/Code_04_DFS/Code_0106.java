package Code_04_DFS;

import Code_99_LuanShua.TreeNode;

public class Code_0106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return createNode(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode createNode(int[] postorder,int post_start,int post_end,int[] inorder,int in_start,int in_end){
        if(post_end==post_start)
            return new TreeNode(postorder[post_end]);
        if(post_start>post_end)
            return null;

        int value=postorder[post_end];
        TreeNode node=new TreeNode(value);
        int index=0;

        for(int i=in_start;i<=in_end;i++){
            if(inorder[i]==value){
                index=i;
                break;
            }
        }

        int pre_len=index-in_start;

        node.left=createNode(postorder,post_start,post_start+pre_len-1,inorder,in_start,index-1);
        node.right=createNode(postorder,post_start+pre_len,post_end-1,inorder,index+1,in_end);
        return node;
    }
}
