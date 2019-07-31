package Code_00_LeetCode_ShuaTi.Code_04_Recur;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/subsets/

public class Code_0078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> item=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        result.add(item);
        generate(0,nums,item,result);
        return result;
    }

    private void generate(int i,int[] nums,List<Integer> item,List<List<Integer>> result){
        if(i>=nums.length){
            return;
        }
        item.add(nums[i]);
        result.add(new ArrayList<>(item));
        generate(i+1,nums,item,result);
        item.remove(item.size()-1);
        generate(i+1,nums,item,result);
    }

//    位运算的方法　　　

    public List<List<Integer>> subset(int[] nums){
        int all_set=1<<nums.length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<all_set;i++){
            List<Integer> item=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){// java不会将所有的非0数作为真
                    item.add(nums[j]);
                }
            }
            result.add(item);
        }
        return result;
    }

}
