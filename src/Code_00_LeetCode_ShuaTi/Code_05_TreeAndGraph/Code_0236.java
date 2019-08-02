package Code_00_LeetCode_ShuaTi.Code_05_TreeAndGraph;

//https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/

import java.util.ArrayList;
import java.util.List;

public class Code_0236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<List<TreeNode>> result=new ArrayList<>();
        List<TreeNode> path=new ArrayList<>();
        serarch(root,result,path,p,q);
        result.get(0).add(new TreeNode(0));
        result.get(1).add(new TreeNode(0));



        int i=0;
        while (true){
            if(result.get(0).get(i)!=result.get(1).get(i)){
                return result.get(0).get(i-1);
            }
            i++;
        }


    }
    private void serarch(TreeNode curNode,List<List<TreeNode>> result,List<TreeNode> path,TreeNode p,TreeNode q){
        if(curNode==null){
            return;
        }
        path.add(curNode);
        if(curNode==p||curNode==q){
            result.add(new ArrayList<>(path));
        }
        serarch(curNode.left,result,path,p,q);
        serarch(curNode.right,result,path,p,q);
        path.remove(path.size()-1);

    }
}
