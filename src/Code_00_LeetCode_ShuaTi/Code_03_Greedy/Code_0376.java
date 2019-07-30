package Code_00_LeetCode_ShuaTi.Code_03_Greedy;

//https://leetcode-cn.com/problems/wiggle-subsequence

//自动机的思路，可以看一下

public class Code_0376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }

        final int begin=0;
        final int up=1;
        final int down=2;
        int res=1;

        int state=begin;
        for(int i=1;i<nums.length;i++){
            switch (state){
                case begin:
                    if(nums[i-1]<nums[i]){
                        state=up;
                        res++;
                    }else if(nums[i-1]>nums[i]){
                        state=down;
                        res++;
                    }
                    break;
                case up:
                    if(nums[i-1]>nums[i]){
                        state=down;
                        res++;
                    }
                    break;
                case down:
                    if(nums[i-1]<nums[i]){
                        state=up;
                        res++;
                    }
                    break;
            }
        }
//        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        Code_0376 code_0376=new Code_0376();
        System.out.println(code_0376.wiggleMaxLength(new int[]{0,0}));
    }
}
