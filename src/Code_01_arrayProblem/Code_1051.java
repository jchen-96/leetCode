package Code_01_arrayProblem;

import java.util.Arrays;

public class Code_1051 {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
         arr=heights.clone();
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i])
                res++;
        }
        return res;

    }
}
