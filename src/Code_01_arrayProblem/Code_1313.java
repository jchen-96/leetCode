package Code_01_arrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_1313 {
    public int[] decompressRLElist(int[] nums) {
        if(nums==null||nums.length<=0)
            return nums;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int count=nums[i];
            for(int j=0;j<count;j++){
                res.add(nums[i+1]);
            }
        }
        int[] r=new int[res.size()];
        for(int i=0;i<res.size();i++){
            r[i]=res.get(i);
        }
        return r;
    }
}
