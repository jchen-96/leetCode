package Code_99_HOT_100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//可能长了个假脑子
public class Code_0406 {
    public int[][] reconstructQueue(int[][] people) {
        if(people==null||people.length<=1)
            return people;
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        LinkedList<int[]> linkedList=new LinkedList<>();
        for(int[] i:people){
            linkedList.add(i[1],i);
        }
        return linkedList.toArray(new int[linkedList.size()][2]);
    }
}
