package Code_99_LuanShua;

//https://leetcode-cn.com/problems/combination-sum/
//组合总和


//类似题目还有:
//
//39.组合总和
//
//40. 组合总和 II
//
//46. 全排列
//
//47. 全排列 II
//
//78. 子集
//
//90. 子集 II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> item=new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(target,0,result,item,candidates,candidates.length);
        return result;
    }
    private void findCombination(int residue,int start,List<List<Integer>> result,List<Integer> item,
                                 int[] candiates,int len){
        if(residue==0){
            result.add(new ArrayList<>(item));
            return;
        }
        for (int i=start;i<len&&residue-candiates[i]>=0;i++){
            item.add(candiates[i]);
            findCombination(residue-candiates[i],i,result,item,candiates,len);
            item.remove(item.size()-1);
        }

    }
}
