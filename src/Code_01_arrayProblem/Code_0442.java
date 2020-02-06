package Code_01_arrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Code_0442 {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums==null||nums.length<=0)
            return new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=(nums[i]-1)%nums.length;
            nums[index]+=nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>2*nums.length){
                res.add(i+1);
            }
        }
        return res;
    }
}
