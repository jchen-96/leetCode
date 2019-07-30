package Code_00_LeetCode_ShuaTi.Code_03_Greedy;

//https://leetcode-cn.com/problems/jump-game-ii/
//提交了十几次才通过，好好看看。。。。。

public class Code_0045 {
    public int jump(int[] nums) {
        if (nums.length<2){
            return 0;
        }
        int cur_max_index=nums[0];
        int pre_max_index=nums[0];
        int count=1;

        for (int i = 1; i <nums.length; i++) {
            if(i>cur_max_index){
                count++;
                cur_max_index=pre_max_index;
            }
            if(pre_max_index<nums[i]+i){
                pre_max_index=nums[i]+i;
            }
        }
        
        return count;
    }
}
