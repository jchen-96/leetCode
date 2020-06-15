package Code_99_MIanshi;

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;
import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_0403 {
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree==null)
            return null;
        LinkedList<TreeNode> queue=new LinkedList<>();
        List<ListNode> res=new ArrayList<>();
        queue.addLast(tree);
        TreeNode last=tree;
        while (!queue.isEmpty()){
            ListNode pre=new ListNode(0);
            ListNode head=pre;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode tnode=queue.removeFirst();
                ListNode node=new ListNode(tnode.val);
                head.next=node;
                head=head.next;
                if(tnode.left!=null)
                    queue.addLast(tnode.left);
                if(tnode.right!=null)
                    queue.addLast(tnode.right);
            }
            res.add(pre.next);
        }
        return res.toArray(new ListNode[0]);
    }
}
