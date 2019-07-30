package Code_00_LeetCode_ShuaTi.Code_03_Greedy;
//https://leetcode-cn.com/problems/jump-game/


public class Code_0055 {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int[] index=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i]=i+nums[i];
        }
        int max_index=0;
        int next_pos=0;
        int p=0;
        while (p<nums.length){
            int range=index[p];
            for(int t=p+1;t<=range;t++){
                if(index[t]>max_index){
                    max_index=index[t];
                    if(max_index>=nums.length-1){
                        return true;
                    }
                    next_pos=t;
                }
            }
            if(p==next_pos){
                return false;
            }
            p=next_pos;

        }
        return false;
    }
}
