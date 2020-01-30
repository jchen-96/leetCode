package Code_99_HOT_100;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/3sum/

//巧妙地双指针思路，主要是进行去重的时候。
public class Code_0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        if(nums==null||len<3)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]>0)
                break;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int L=i+1;
            int R=len-1;
            while (L<R){
                int sum=nums[i]+nums[L]+nums[R];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R&&nums[L]==nums[L+1])
                        L++;
                    while (R>L&&nums[R]==nums[R-1])
                        R--;
                    L++;
                    R--;
                }
                else if(sum<0)
                    L++;
                else
                    R--;
            }
        }
        return res;
    }
}
