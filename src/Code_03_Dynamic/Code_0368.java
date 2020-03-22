package Code_03_Dynamic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_0368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums==null||nums.length==0)
            return new ArrayList<>();
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] last = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            last[i]=-1;
        }
        int max = 0;
        int flag=-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                    last[i] = j;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                flag=i;
            }
        }

        List<Integer> res=new ArrayList<>();
        for(int i=flag;i!=-1;i=last[i])
        {
            res.add(nums[i]);
        }
        return res;
    }
}
