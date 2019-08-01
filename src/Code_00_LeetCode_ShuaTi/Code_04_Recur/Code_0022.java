package Code_00_LeetCode_ShuaTi.Code_04_Recur;

//https://leetcode-cn.com/problems/generate-parentheses/

import java.util.ArrayList;
import java.util.List;

public class Code_0022 {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generate("",n,n,result);
        return result;
    }
    private void generate(String item,int left,int right,List<String> result){
        if(left==0&&right==0){
            result.add(new String(item));
        }
        if(left>0){
            generate(item+"(",left-1,right,result);
        }
        if(left<right){
            generate(item+")",left,right-1,result);
        }

    }
}
