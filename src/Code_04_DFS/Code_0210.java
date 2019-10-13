package Code_04_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_0210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indrgees=new int[numCourses];
        int temp=numCourses;
        for(int[] cp:prerequisites)
            indrgees[cp[0]]++;
        LinkedList<Integer> queue=new LinkedList<>();
        LinkedList<Integer> result=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indrgees[i]==0)
                queue.addLast(i);
        }

        while (!queue.isEmpty()){
            int pre=queue.removeFirst();
            result.addLast(pre);
            numCourses--;
            for(int[] cp:prerequisites){
                if(cp[1]!=pre)
                    continue;
                if(--indrgees[cp[0]]==0)
                    queue.addLast(cp[0]);
            }
        }
        if(numCourses!=0)
            return new int[]{};
        int[] arr=new int[temp];
        for(int i=0;i<temp;i++){
            arr[i]=result.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

        new Code_0210().findOrder(2,new int[][]{{1,0}});
    }
}
