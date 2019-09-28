package Code_04_DFS;


//https://leetcode-cn.com/problems/binary-tree-right-side-view/

//二叉树的层序遍历

import Code_99_LuanShua.TreeNode;

import java.util.*;

public class Code_0199 {


    Stack<Integer> stack=new Stack<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return new ArrayList<>();                                   //边界条件

        Queue<TreeNode> q=new LinkedList();              //创建的队列用来存放结点，泛型注意是TreeNode
        q.add(root);
        while(!q.isEmpty()){                             //队列为空说明已经遍历完所有元素，while语句用于循环每一个层次
            int count=q.size();
            List<Integer> list=new ArrayList<>();
            while(count>0){                              //遍历当前层次的每一个结点，每一层次的Count代表了当前层次的结点数目
                TreeNode temp=q.peek();
                q.poll();                               //遍历的每一个结点都需要将其弹出
                list.add(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);                   //迭代操作，向左探索
                if(temp.right!=null)
                    q.add(temp.right);
                count--;
            }
            stack.push(list.get(list.size()-1));
        }
        return new ArrayList<>(stack);
    }

}
