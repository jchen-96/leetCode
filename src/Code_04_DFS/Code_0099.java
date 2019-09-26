package Code_04_DFS;


//https://leetcode-cn.com/problems/recover-binary-search-tree/


import Code_99_LuanShua.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_0099 {

    /**
     * Jchen Code
     */
    public void recoverTree(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        midOrder(root,list);
        int fistrV=-1;
        int secondV=-1;
        for(int i=0;i<list.size();i++){
            if(i+1<list.size()&&list.get(i)>list.get(i+1)){
                fistrV=list.get(i);
                break;
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<list.get(i-1)){
                secondV=list.get(i);
                break;
            }
        }
        second(root,fistrV,secondV);
    }

    private void midOrder(TreeNode node,List<Integer> list){
        if(node==null)
            return;
        midOrder(node.left,list);
        list.add(node.val);
        midOrder(node.right,list);

    }
    private void second(TreeNode node,int first,int second){
        if(node==null)
            return;
        second(node.left,first,second);
        if(node.val==first)
            node.val=second;
        else if(node.val==second)
            node.val=first;
        second(node.right,first,second);

    }

    /**
     * 不用递归和
     * @param root
     */

    public void recoverTreeByOther(TreeNode root){
    }
}
