package Code_99_JZOFFER;

public class Code_61 {
    public boolean isStraight(int[] nums) {
        int[] record=new int[13];
        int max=-1;
        int min=100;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                continue;
            if(record[nums[i]-1]!=0)
                return false;
            else
                record[nums[i]-1]=1;
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return max-min<=4;
    }
}
