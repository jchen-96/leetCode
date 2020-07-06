package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Code_165 {

    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String[] data = input.readLine().split(" ");
            int num = Integer.parseInt(data[0]);
            int rootVal = Integer.parseInt(data[1]);
            int[][] list = new int[num + 1][3];
            int t;
            for (int i = 1; i < num + 1; i++) {
                String[] sts = input.readLine().split(" ");
                t = Integer.parseInt(sts[0]);
                list[t][0] = Integer.parseInt(sts[1]);
                list[t][1] = Integer.parseInt(sts[2]);
                list[t][2] = Integer.parseInt(sts[3]);
            }
            int sum = Integer.parseInt(input.readLine());
            TreeNode root = new TreeNode(rootVal);
            createTree(root, list);
            maxLen(root, sum);
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static int res = Integer.MIN_VALUE;

    private static void maxLen(TreeNode root, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        preOrder(map, sum, 0, 1, root);

    }

    private static int preOrder(HashMap<Integer, Integer> map, int sum, int preSum, int level, TreeNode node) {
        if (node == null)
            return res;
        preSum += node.val;
        if (!map.containsKey(preSum)) {
            map.put(preSum, level);
        }
        if (map.containsKey(preSum - sum)) {
            res = Math.max(res, level - map.get(preSum - sum));
        }
        preOrder(map, sum, preSum, level + 1, node.left);
        preOrder(map, sum, preSum, level + 1, node.right);
        if (level == map.get(preSum)) {
            map.remove(preSum);
        }
        return res;


    }


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
