package Code_01_arrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        if(arr==null||arr.length<=0)
            return null;
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++){
            if(min==Math.abs(arr[i]-arr[i-1]))
                res.add(new ArrayList<>(Arrays.asList(arr[i-1],arr[i])));
        }

        return res;
    }
}
