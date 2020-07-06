package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_168 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int root = Integer.parseInt(strings[1]);
        TreeNode head1 = new TreeNode(root);
        int[][] arr1 = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            strings = br.readLine().split(" ");
            arr1[Integer.parseInt(strings[0])][0] = Integer.parseInt(strings[1]);
            arr1[Integer.parseInt(strings[0])][1] = Integer.parseInt(strings[2]);
        }
        createTree(head1, arr1);

        level_order(head1);

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < normal.size(); i++) {
            System.out.print("Level " + (i + 1) + " : ");
            temp = normal.get(i);
            for (int j = 0; j < temp.size(); j++)
                System.out.print(temp.get(j) + " ");
            System.out.println();
        }


        for (int i = 0; i < normal.size(); i++) {
            if (i % 2 == 0) {
                System.out.print("Level " + (i + 1) + " from left to right: ");
                temp = normal.get(i);
                for (int j = 0; j < temp.size(); j++)
                    System.out.print(temp.get(j) + " ");
            } else {
                System.out.print("Level " + (i + 1) + " from right to left: ");
                temp = normal.get(i);
                for (int j = temp.size() - 1; j >= 0; j--)
                    System.out.print(temp.get(j) + " ");
            }
            if (i != normal.size() - 1)
                System.out.println();
        }


    }

    private static List<List<Integer>> normal = new ArrayList<>();

    private static void level_order(TreeNode node) {
        if (node == null)
            return;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(node);
        ArrayList<Integer> temp = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.pollFirst();
                if (cur.left != null)
                    queue.addLast(cur.left);
                if (cur.right != null)
                    queue.addLast(cur.right);
                temp.add(cur.val);
            }
            normal.add(new ArrayList<>(temp));
            temp.clear();
        }
    }

    //递归建树
    public static void createTree(TreeNode head, int[][] arr) {
        if (head == null) {
            return;
        }
        if (arr[head.val][0] != 0) {
            head.left = new TreeNode(arr[head.val][0]);
            createTree(head.left, arr);
        }
        if (arr[head.val][1] != 0) {
            head.right = new TreeNode(arr[head.val][1]);
            createTree(head.right, arr);
        }
    }
}
