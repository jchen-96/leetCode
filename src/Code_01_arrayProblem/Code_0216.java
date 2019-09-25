package Code_01_arrayProblem;

//https://leetcode-cn.com/problems/combination-sum-iii/

//组合总和，穷举递归　在leetcode 组合总和，有五六道题目

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Code_0216 {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        traceBack(k, n, 0, 1, new LinkedList<>());
        return ans;
    }

    public void traceBack(int k, int n, int sum, int begin, LinkedList<Integer> list) {
        if (k == 0) {
            if (n == sum)
                ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = begin; i < 10; i++) {
            list.add(i);
            traceBack(k - 1, n, sum + i, i + 1, list);
            list.removeLast();
        }
    }
}

