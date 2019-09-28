package Code_99_LuanShua;

//https://leetcode-cn.com/problems/product-of-array-except-self/
//双指针

public class Code_0238 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for (int i=0;i<res.length;i++)
            res[i]=1;
        int left=1,right=1;
        for(int i=0;i<res.length;i++){
            res[i]*=left;
            left*=nums[i];

            res[n-i-1]*=right;
            right*=nums[n-i-1];

        }

        return res;
    }
}
