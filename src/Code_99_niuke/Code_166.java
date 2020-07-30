package Code_99_niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_166 {
    public static TreeNode createTree(BufferedReader br){
        try{
            //输入是以先序遍历的顺序输入的，所以这里要按先序来接受
            String[] arr = br.readLine().trim().split(" ");
            int data = Integer.parseInt(arr[0]);
            int left = Integer.parseInt(arr[1]);
            int right = Integer.parseInt(arr[2]);
            TreeNode root = new TreeNode(data);
            if(left != 0){
                root.left = createTree(br);
            }
            if(right != 0){
                root.right = createTree(br);
            }
            return root;
        }catch(IOException e){
            return null;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        TreeNode root = createTree(br);
        System.out.println(process(root).size);

    }
    private static ReturnType process(TreeNode node){
        if(node==null)
            return new ReturnType(null,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        ReturnType left=process(node.left);
        ReturnType right=process(node.right);

        int min=Math.min(node.val,Math.min(left.min,right.min));

        int max=Math.max(node.val,Math.max(left.max,right.max));

        TreeNode maxNode=left.size>right.size?left.maxHead:right.maxHead;
        int maxSize=Math.max(left.size,right.size);

        if(left.maxHead==node.left&&right.maxHead==node.right&&node.val>left.max&&node.val<right.min){
            maxNode=node;
            maxSize=left.size+right.size+1;
        }
        return new ReturnType(maxNode,maxSize,min,max);



    }


}
class ReturnType{
    public TreeNode maxHead;
    public int size;
    public int min;
    public int max;

    public ReturnType(TreeNode maxHead, int size, int min, int max) {
        this.maxHead = maxHead;
        this.size = size;
        this.min = min;
        this.max = max;
    }
}
