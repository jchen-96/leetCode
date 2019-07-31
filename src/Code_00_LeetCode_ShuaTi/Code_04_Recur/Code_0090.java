package Code_00_LeetCode_ShuaTi.Code_04_Recur;

//https://leetcode-cn.com/problems/subsets-ii/

import java.util.*;

public class Code_0090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        Set<List<Integer>> res_set=new HashSet<>();

        List<Integer> item=new ArrayList<>();
        result.add(item);
        generate(0,nums,item,result,res_set);
        return result;


    }
    private void generate(int i,int[] nums,List<Integer> item,List<List<Integer>> result,Set<List<Integer>> res_set){
        if(i>=nums.length){
            return;
        }
        item.add(nums[i]);
        if(!res_set.contains(item)){
            result.add(new ArrayList<>(item));
            res_set.add(new ArrayList<>(item));
        }
        generate(i+1,nums,item,result,res_set);
        item.remove(item.size()-1);
        generate(i+1,nums,item,result,res_set);

    }
}
