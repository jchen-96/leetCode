package Code_00_LeetCode_ShuaTi.Code_04_Recur;


import Code_01_arrayProblem.Code_0950;

import java.util.*;

public class Code_0040 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> item=new ArrayList<>();
        Set<List<Integer>> res_set=new HashSet<>();

        Arrays.sort(candidates);//必须要先排序！！！！！！！！！！！
        generate(0,candidates,target,0,result,item,res_set);

        return result;


    }
    private void generate(int index,int[] candidates,int target,int sum,
                          List<List<Integer>> result,
                          List<Integer> item,
                          Set<List<Integer>> res_set
                          ){
        if(index>=candidates.length||sum+candidates[index]>target){
            return;
        }
        sum+=candidates[index];
        item.add(candidates[index]);
        if(!res_set.contains(item)&&sum==target){
            res_set.add(new ArrayList<>(item));
            result.add(new ArrayList<>(item));
        }
        generate(index+1,candidates,target,sum,result,item,res_set);
        sum-=candidates[index];
        item.remove(item.size()-1);
        generate(index+1,candidates,target,sum,result,item,res_set);

    }

    public static void main(String[] args) {
        Code_0040 code_0040=new Code_0040();
        code_0040.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }


}
