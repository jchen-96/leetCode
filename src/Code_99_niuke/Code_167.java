package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Code_167 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        TreeNode root = createTree(reader);
        TreeNode[] res = getErrorNode(root);
        System.out.print(res[1].value);
        System.out.println(" " + res[0].value);
    }

    public static TreeNode[] getErrorNode(TreeNode node) {
        if (node == null)
            return null;
        TreeNode[] res = new TreeNode[2];

        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (!stack.isEmpty()||node!=null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                if (pre != null && pre.value > node.value) {
                    res[0] = res[0] == null ? pre : res[0];
                    res[1] = node;
                }
                pre = node;
                node = node.right;
            }
        }
        return res;
    }


    public static TreeNode createTree(BufferedReader reader) throws IOException {
        String[] strings = reader.readLine().trim().split(" ");
        int rootData = Integer.valueOf(strings[0]);
        int leftData = Integer.valueOf(strings[1]);
        int rightData = Integer.valueOf(strings[2]);
        TreeNode root = new TreeNode(rootData);
        if (leftData != 0) {
            root.left = createTree(reader);
        }
        if (rightData != 0) {
            root.right = createTree(reader);
        }
        return root;
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}
