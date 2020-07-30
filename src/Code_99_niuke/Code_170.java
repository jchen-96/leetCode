package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_170 {


    private static boolean isContain(TreeNode node1, TreeNode node2) {
        if (node2 == null)
            return true;
        if (node1 == null)
            return false;
        return isSame(node1, node2) || isContain(node1.left, node2) || isContain(node1.right, node2);


    }

    private static boolean isSame(TreeNode node1, TreeNode node2) {

        if (node2 == null)
            return true;
        if (node1 == null)
            return false;
        if (node1.value != node2.value)
            return false;
        return isSame(node1.left, node2.left) && isSame(node1.right, node2.right);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ss1 = reader.readLine().split(" ");
        int n1 = Integer.parseInt(ss1[0]);
        int r1 = Integer.parseInt(ss1[1]);
        int[][] a = new int[n1 + 1][2];
        int t;
        for (int i = 0; i < n1; i++) {
            String string = reader.readLine();
            String[] sts = string.split(" ");
            t = Integer.parseInt(sts[0]);
            a[t][0] = Integer.parseInt(sts[1]);
            a[t][1] = Integer.parseInt(sts[2]);
        }
        String[] ss2 = reader.readLine().split(" ");
        int n2 = Integer.parseInt(ss2[0]);
        int r2 = Integer.parseInt(ss2[1]);
        int[][] b = new int[n1 + 1][2];
        for (int i = 0; i < n2; i++) {
            String string = reader.readLine();
            String[] sts = string.split(" ");
            t = Integer.parseInt(sts[0]);
            b[t][0] = Integer.parseInt(sts[1]);
            b[t][1] = Integer.parseInt(sts[2]);
        }
        TreeNode tree1 = new TreeNode(r1);
        createTree(tree1, a);
        TreeNode tree2 = new TreeNode(r2);
        createTree(tree2, b);
        System.out.println(isContain(tree1, tree2));
    }


    private static void createTree(TreeNode root, int[][] a) {
        if (root == null)
            return;
        int i = root.value;
        int l = a[i][0];
        int r = a[i][1];
        if (l != 0) {
            TreeNode leftNode = new TreeNode(l);
            root.left = leftNode;
            leftNode.parent = root;
            createTree(leftNode, a);
        }
        if (r != 0) {
            TreeNode rightNode = new TreeNode(r);
            root.right = rightNode;
            rightNode.parent = root;
            createTree(rightNode, a);
        }
    }

    private static class TreeNode {
        int value;
        TreeNode parent;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.value = val;
        }
    }
}
