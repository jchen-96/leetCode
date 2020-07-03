package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Code_163 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        TreeNode  root=createTree(reader);
        preOrder(root);
        levelOrder(root);
        System.out.println(pre.toString());
        System.out.println(levelOrder.toString());

    }

    private static StringBuilder pre=new StringBuilder();
    private static StringBuilder levelOrder=new StringBuilder();
    private static void preOrder(TreeNode node){
        if(node==null){
            pre.append("#!");
            return;
        }
        pre.append(node.val+"!");
        preOrder(node.left);
        preOrder(node.right);
    }

    private static void levelOrder(TreeNode node){

        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.addLast(node);
        levelOrder.append(node.val+"!");
        while (!queue.isEmpty()){
            int size=queue.size();
            TreeNode cur=null;
            for(int i=0;i<size;i++){
                cur=queue.removeFirst();
                if(cur.left==null){
                    levelOrder.append("#!");
                }else{
                    levelOrder.append(cur.left.val+"!");
                    queue.addLast(cur.left);
                }
                if(cur.right==null){
                    levelOrder.append("#!");
                }else{
                    levelOrder.append(cur.right.val+"!");
                    queue.addLast(cur.right);
                }
            }
        }

    }



    //递归建树
    public static TreeNode createTree(BufferedReader br) {
        try {
            String[] arr = br.readLine().trim().split(" ");
            int val = Integer.parseInt(arr[0]);
            int l = Integer.parseInt(arr[1]);
            int r = Integer.parseInt(arr[2]);
            TreeNode node = new TreeNode(val);
            if (l != 0) {
                node.left = createTree(br);
            }
            if (r != 0) {
                node.right = createTree(br);
            }
            return node;

        } catch (Exception e) {
            return null;
        }
    }
}
