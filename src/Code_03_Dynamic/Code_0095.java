package Code_03_Dynamic;

import Code_99_LuanShua.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

//do again and figure out

public class Code_0095 {
//    递归的思路
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans=new ArrayList<>();
        if(n==0)
            return ans;
        return getAll(1,n);
    }
    private List<TreeNode> getAll(int start,int end){
        List<TreeNode> ans=new ArrayList<>();
        if(start>end){
            ans.add(null);
            return ans;
        }
        if(start==end){
            TreeNode node=new TreeNode(start);
            ans.add(node);
            return ans;
        }
        for (int i=start;i<=end;i++){
            List<TreeNode> left=getAll(start,i-1);
            List<TreeNode> right=getAll(i+1,end);

            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode root=new TreeNode(i);
                    root.left=l;
                    root.right=r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
//    动态规划的办法

//    复制并且实现偏差的函数
    private TreeNode clone(TreeNode n,int offset){
        if(n==null)
            return null;
        TreeNode node=new TreeNode(n.val+offset);
        node.left=clone(n.left,offset);
        node.right=clone(n.right,offset);
        return node;
    }

    public List<TreeNode> generateTrees_dp(int n){
        ArrayList<TreeNode>[] dp=new ArrayList[n+1];
        dp[0]=new ArrayList<>();
        if(n==0)
            return dp[0];
        dp[0].add(null);
        for(int len=1;len<=n;len++){
            dp[len]=new ArrayList<>();
            for(int root=1;root<=len;root++){
                int left=root-1;
                int right=len-root;
                for(TreeNode l:dp[left]){
                    for(TreeNode r:dp[right]){
                        TreeNode node=new TreeNode(root);
                        node.left=l;
                        node.right=clone(r,root);
                        dp[len].add(node);
                    }
                }

            }
        }
        return dp[n];
    }


}
