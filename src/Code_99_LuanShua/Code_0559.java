package Code_99_LuanShua;
//https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
//no need to read


public class Code_0559 {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        int depth=0;
        for(Node node:root.children){
            depth=Math.max(depth,maxDepth(node));
        }
        return 1+depth;
    }
}
