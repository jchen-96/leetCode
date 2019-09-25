package Code_99_LuanShua;

//https://leetcode-cn.com/problems/all-possible-full-binary-trees/

//官方solution https://leetcode-cn.com/problems/all-possible-full-binary-trees/solution/suo-you-ke-neng-de-man-er-cha-shu-by-leetcode/

//可以看一下，巧妙的递归

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//need to read
public class Code_0894 {
    Map<Integer,List<TreeNode>> maps=new HashMap<>();

    public List<TreeNode> allPossibleFBT(int N) {
        if(!maps.containsKey(N)){
            List<TreeNode> ans=new LinkedList<>();
            if(N==1){
                ans.add(new TreeNode(0));
            }else if(N%2==1){
                for(int x=0;x<N;x++){
                    int y=N-1-x;
                    for(TreeNode left:allPossibleFBT(x)){
                        for(TreeNode right:allPossibleFBT(y)){
                            TreeNode temp=new TreeNode(0);
                            temp.left=left;
                            temp.right=right;
                            ans.add(temp);
                        }
                    }
                }
            }
            maps.put(N,ans);
        }
        return maps.get(N);
    }
}
