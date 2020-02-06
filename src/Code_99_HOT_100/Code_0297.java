package Code_99_HOT_100;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_0297 {
    public String serialize(TreeNode root) {
        if(root==null)
            return "#_";
        String str="";
        str+=root.val+"_";
        str+=serialize(root.left);
        str+=serialize(root.right);

        return str;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals=data.split("_");
        return reserialize(new ArrayList<>(Arrays.asList(vals)));
    }
    private TreeNode reserialize(List<String> list){
        if(list.get(0).equals("#")){
            list.remove(0);
            return null;
        }
        int v=Integer.valueOf(list.get(0));
        TreeNode node=new TreeNode(v);
        list.remove(0);
        node.left=reserialize(list);
        node.right=reserialize(list);
        return node;
    }
}
