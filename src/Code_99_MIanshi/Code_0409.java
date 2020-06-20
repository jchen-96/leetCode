package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.LinkedList;
import java.util.List;


//太难了
public class Code_0409 {

    List<List<Integer>> res=new LinkedList<>();
    public List<List<Integer>> BSTSequences(TreeNode root) {
        if(root==null){
            res.add(new LinkedList<>());
            return res;
        }
        LinkedList<Integer> path=new LinkedList<>();
        path.add(root.val);
        paths(root,new LinkedList<>(),path);
        return res;
    }

    private void paths(TreeNode root,LinkedList<TreeNode> queue,LinkedList<Integer> path){
        if(root==null)
            return;
        if(root.left!=null)
            queue.add(root.left);
        if(root.right!=null)
            queue.add(root.right);
        if(queue.isEmpty()){
            res.add(new LinkedList<>(path));
            return;
        }
        int len=queue.size();
        for(int i=0;i<len;i++){
            TreeNode cur = queue.get(i);
            queue.remove(i);
            path.add(cur.val);

            paths(cur, new LinkedList<>(queue), path);

            queue.add(i, cur);
            path.removeLast();
        }
    }
}
