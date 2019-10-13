package Code_04_DFS;

import java.util.LinkedList;



public class Code_0207 {


//    BFS
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        int[] indrgees=new int[numCourses];
        for(int[] cp:prerequisites)
            indrgees[cp[0]]++;
        LinkedList<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indrgees[i]==0)
                queue.addLast(i);
        }

        while (!queue.isEmpty()){
            int pre=queue.removeFirst();
            numCourses--;
            for(int[] cp:prerequisites){
                if(cp[1]!=pre)
                    continue;
                if(--indrgees[cp[0]]==0)
                    queue.addLast(cp[0]);
            }
        }
        return numCourses==0;
    }

//    DFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] adjacency=new int[numCourses][numCourses];
        int[] flags=new int[numCourses];
        for(int[] cp:prerequisites){
            adjacency[cp[1]][cp[0]]=1;
        }
        for(int i=0;i<numCourses;i++){
            if(!dfs(adjacency,flags,i))
                return false;
        }
        return true;
    }

    private boolean dfs(int[][] adjacency,int[] flag,int i){
        if(flag[i]==1)
            return false;
        if(flag[i]==-1)
            return true;
        flag[i]=1;
        for(int j=0;j<adjacency.length;j++){
            if(adjacency[i][j]==1&&!dfs(adjacency,flag,j))
                return false;
        }
        flag[i]=-1;
        return true;
    }


}
