package Code_99_LuanShua;

//https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/

//no need to read

public class Code_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=createNode(preorder,0,preorder.length-1);
        return root;
    }

    private TreeNode createNode(int[] preorder,int l,int r){
        if(l>r){
            return null;
        }
        if(l==r){
            return new TreeNode(preorder[l]);
        }
        TreeNode node=new TreeNode(preorder[l]);

        int firstbig=l;
        for(int i=l+1;i<=r;i++){
            if(preorder[i]>preorder[l]){
                firstbig=i;
                break;
            }
        }
        if(firstbig==l){
            firstbig=r+1;
        }

        node.left=createNode(preorder,l+1,firstbig-1);
        node.right=createNode(preorder,firstbig,r);
        return node;
    }

    public static void main(String[] args) {
        System.out.println("tttt");
        TreeNode root=new Code_1008().bstFromPreorder(new int[]{4,2});

    }
}
