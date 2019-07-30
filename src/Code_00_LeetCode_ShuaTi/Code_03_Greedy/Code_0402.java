package Code_00_LeetCode_ShuaTi.Code_03_Greedy;

//https://leetcode-cn.com/problems/remove-k-digits

import java.util.Stack;

public class Code_0402 {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()){
            return "0";
        }
        char[] nums= num.toCharArray();
        Stack<Character> stack=new Stack<>();
        int i=0;
        while (k>0){
            if(i>=nums.length){
                break;
            }
            if(stack.empty()){
                stack.push(nums[i++]);
            }else{
                if(nums[i]>=stack.peek()){
                    stack.push(nums[i++]);
                }else{
                    while(k>0&&!stack.empty()&&nums[i]<stack.peek()){
                    stack.pop();
                    k--;
                    }
                    stack.push(nums[i++]);
                }
            }
        }
        while(i<nums.length){
            stack.push(nums[i++]);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        String res="";
        while(!stack.isEmpty()){
            res=stack.pop()+res;
        }
        int m;
        for(m=0;m<res.length()-1;){
            if(res.charAt(m)=='0'){
                m++;
            }else{
                break;
            }
        }
        return res.substring(m,res.length());
        
    }
    public static void main(String[] args) {
        Code_0402 code_0402=new Code_0402();
        System.out.println(code_0402.removeKdigits("5337", 2));
    }
}
