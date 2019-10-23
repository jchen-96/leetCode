package Code_99_LuanShua;

import java.util.HashSet;
import java.util.Set;

public class Code_0287 {
    public int findDuplicate(int[] nums) {
        int[] temp=new int[nums.length];
        for(int i:nums){
            if(temp[i]!=0)
                return i;
            else
                temp[i]=i;
        }
        return -1;
    }

}
