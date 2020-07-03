package Code_99_niuke;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Code_161 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        TreeNode node = createTree(reader);
        preOrder(node);
        midOrder(node);
        postOrder(node);
        System.out.println(pre.toString().trim());
        System.out.println(mid.toString().trim());
        System.out.println(post.toString().trim());

    }

    private static void preOrder(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            pre.append(cur.val + " ");
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
    }

    private static void midOrder(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        TreeNode cur =node.left;
        while (!stack.isEmpty()||cur!=null) {
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            mid.append(cur.val+" ");
            cur=cur.right;
        }
    }

    private static void postOrder(TreeNode node) {
        if (node == null)
            return;
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(node);
        while (!s1.isEmpty()){
            TreeNode cur=s1.pop();
            s2.push(cur);
            if(cur.left!=null)
                s1.push(cur.left);
            if(cur.right!=null)
                s1.push(cur.right);
        }
        while (!s2.isEmpty()){
            post.append(s2.pop().val+" ");
        }
    }


    private static StringBuilder pre = new StringBuilder();
    private static StringBuilder mid = new StringBuilder();
    private static StringBuilder post = new StringBuilder();


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

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}

