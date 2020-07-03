package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_165 {


    public static void createTree(TreeNode root, int[][] a) {
        if (root == null) {
            return;
        }
        int i = root.val;
        root.val = a[i][2];
        int l = a[i][0];
        int r = a[i][1];

        if (l != 0) {
            TreeNode leftNode = new TreeNode(l);
            root.left = leftNode;

            createTree(leftNode, a);
        }
        if (r != 0) {
            TreeNode rightNode = new TreeNode(r);
            root.right = rightNode;
            createTree(rightNode, a);
        }
    }
}
