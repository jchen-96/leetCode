package Code_99_niuke;

import Code_00_LeetCode_ShuaTi.Code_04_Practice.TreeNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Code_156 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        TreeNode root = createTree(reader);
        root=changeToList(root);
        StringBuilder sb=new StringBuilder();
        while (root!=null){
            sb.append(root.val+" ");
            root=root.right;
        }
        System.out.println(sb.toString().trim());


    }
    public static TreeNode changeToList(TreeNode node){
        if(node==null||(node.left==null&&node.right==null))
            return node;
        return process(node).start;
    }

    public static ResultType process(TreeNode node) {
        if (node == null)
            return new ResultType(null, null);
        ResultType left = process(node.left);
        ResultType right = process(node.right);

        if (left.end != null) {
            left.end.right = node;
        }
        node.left = left.end;
        if (right.start != null) {
            right.start.left = node;
        }
        node.right = right.start;

        return new ResultType(left.start == null ? node : left.start, right.end == null ? node : right.end);
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

class ResultType {
    TreeNode start;
    TreeNode end;

    public ResultType(TreeNode start, TreeNode end) {
        this.start = start;
        this.end = end;
    }
}
