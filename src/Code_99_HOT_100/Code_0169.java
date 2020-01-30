package Code_99_HOT_100;


//https://leetcode-cn.com/problems/majority-element/

import java.util.HashMap;
import java.util.Map;

public class Code_0169 {
    public int majorityElement(int[] nums) {
        if(nums==null||nums.length==0)
            return -1;
        Map<Integer,Integer> map=new HashMap<>();
        int half=nums.length/2;
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
            if(map.get(i)>half)
                return i;
        }
        return -1;
    }
}
