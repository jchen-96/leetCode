package Code_99_LuanShua;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


//no need to read
public class Code_0961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<A.length;i++){
            if(set.contains(A[i]))
                return A[i];
            set.add(A[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(new Code_0961().repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}

