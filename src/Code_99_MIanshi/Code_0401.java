package Code_99_MIanshi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_0401 {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        // 将矩阵转为邻接表
        List<Integer>[] adj = new ArrayList[n];
        for (int[] edge : graph) {
            int from = edge[0];
            int to = edge[1];
            if (adj[from] == null)
                adj[from] = new ArrayList<>();
            adj[from].add(to);
        }
        // 建一个函数进行广度遍历
        return hasPath(n, adj, start, target);
    }

    private boolean hasPath(int n, List<Integer>[] graph, int start, int target) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(start);
        boolean[] visited = new boolean[n];
        visited[start] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++){
                int node=queue.pollFirst();
                List<Integer> list=graph[node];
                if(list==null)
                    continue;
                for(Integer next:list){
                    if(next==target)
                        return true;
                    if(visited[next])
                        continue;
                    visited[next]=true;
                    queue.addLast(next);
                }
            }
        }
        return false;

    }


}
