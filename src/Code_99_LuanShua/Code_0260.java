package Code_99_LuanShua;


//位运算，分离出一个数字的进一步

public class Code_0260 {
    public int[] singleNumber(int[] nums) {
        if(nums==null||nums.length<=2)
            return nums;
        int ans1=nums[0]^nums[1];
        for (int i = 2; i < nums.length; i++) {
            ans1=ans1^nums[i];
        }
        int index=1;
        int count=0;
        while ((index&ans1)==0){
            index=index<<1;
            count++;
        }

        int ans2=0;
        int ans3=0;
        int temp=1<<count;

        for (int i = 0; i < nums.length; i++) {
            if((temp&nums[i])==0)
                ans2^=nums[i];
            else
                ans3^=nums[i];
        }
        return new int[]{ans1^ans2,ans1^ans3};
    }
}
