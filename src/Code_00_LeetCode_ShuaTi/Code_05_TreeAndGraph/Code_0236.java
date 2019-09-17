package Code_00_LeetCode_ShuaTi.Code_05_TreeAndGraph;

//https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/

import java.util.ArrayList;
import java.util.List;

public class Code_0236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> result=new ArrayList<>();

        List<TreeNode> p_path=new ArrayList<>();
        List<TreeNode> q_path=new ArrayList<>();

        int[] finish_p=new int[1];
        int[] finish_q=new int[1];


//        serahNode(root,p_path,finish_p,p);
//        serahNode(root,q_path,finish_q,q);

        p_path.add(new TreeNode(0));
        q_path.add(new TreeNode(0));


        int i=0;
        while (true){
            if(q_path.get(i)!=p_path.get(i)){
                return q_path.get(i-1);
            }
            i++;
        }


    }
    private void serarch(TreeNode curNode, List<List<TreeNode>> result, List<TreeNode> path,
                         TreeNode p, TreeNode q, int[] finsh){
        if(curNode==null||finsh[0]==2){
            return;
        }
        path.add(curNode);
        if(curNode==p||curNode==q){
            finsh[0]+=1;
            result.add(new ArrayList<>(path));
        }
        serarch(curNode.left,result,path,p,q,finsh);
        serarch(curNode.right,result,path,p,q,finsh);
        path.remove(path.size()-1);

    }
    private void serahNode(TreeNode node, List<TreeNode> path, int[] finish, TreeNode node_serarch, List<TreeNode> result){
        if(node==null||finish[0]==1){
            return;
        }
        path.add(node);
        if(node==node_serarch){
            finish[0]=1;
        }
        serahNode(node.left,path,finish,node_serarch,result);
        serahNode(node.right,path,finish,node_serarch,result);
        path.remove(path.size()-1);

    }
}
