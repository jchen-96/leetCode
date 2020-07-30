package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_172 {

    public static TreeNode createTree(BufferedReader in) throws IOException {
        String[] strings = in.readLine().split(" ");
        int[] nodes = getIntArray(strings);
        TreeNode root = new TreeNode(nodes[0]);
        if (nodes[1] != 0) {
            root.left = createTree(in);
        }
        if (nodes[2] != 0) {
            root.right = createTree(in);
        }
        return root;
    }

    public static int[] getIntArray(String[] strs) {
        int[] res = new int[strs.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.valueOf(strs[i]);
        }
        return res;
    }

    private static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value){
            this.value = value;
        }
    }

    public static void main(String[] args){
        TreeNode root = null;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            bf.readLine();
            root = createTree(bf);
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode node){
        if(node==null)
            return true;
        if(Math.abs(depth(node.left)-depth(node.right))<=1)
            return isBalanced(node.left)&&isBalanced(node.right);

        return false;
    }
    public static int depth(TreeNode node){
        if(node==null)
            return 0;
        return Math.max(depth(node.left),depth(node.right))+1;
    }


}
