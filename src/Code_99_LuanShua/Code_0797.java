package Code_99_LuanShua;

//https://leetcode-cn.com/problems/all-paths-from-source-to-target/
// need to read
// dfs 深度优先搜索，回溯算法

import java.util.ArrayList;
import java.util.List;

public class Code_0797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> item=new ArrayList<>();
        int n=graph.length;
        dfs(result,item,0,n-1,graph);
        return result;
    }

    private void dfs(List<List<Integer>> result,List<Integer> item,int i,int target,int[][] graph){
        if(i==target){
            item.add(i);
            result.add(new ArrayList<>(item));
            item.remove(item.size()-1);
            return;
        }
        item.add(i);
        for(int index=0;index<graph[i].length;index++){
            dfs(result,item,graph[i][index],target,graph);
        }
        item.remove(item.size()-1);

    }
}
