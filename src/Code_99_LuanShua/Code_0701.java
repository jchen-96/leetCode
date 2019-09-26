package Code_99_LuanShua;

//https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
//二叉树的节点插入操作


public class Code_0701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=root;
        TreeNode findNode=findNode(root,val);
        TreeNode newNode=new TreeNode(val);
        if(val>findNode.val){
            findNode.right=newNode;
        }else{
            findNode.left=newNode;
        }
        return temp;
    }
    private TreeNode findNode(TreeNode node,int val){
        if(node.left==null&&node.right==null){
            return node;
        }
        if(node.val>val){
            if(node.left!=null)
                return findNode(node.left,val);
            else
                return node;
        }else{
            if (node.right!=null)
                return findNode(node.right,val);
            else
                return node;
        }
    }
}
