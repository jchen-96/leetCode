package Code_99_HOT_100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
public class Code_0017 {

    Map<Character,String> map=new HashMap<Character,String>(){{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    private List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return  new ArrayList<>();
        }
        findOne(digits,0,"");

        return res;
    }
    private void findOne(String digits,int index,String s){
        if(index==digits.length()){
            res.add(s);
            return;
        }
        char c=digits.charAt(index);
        String letters=map.get(c);
        for(int i=0;i<letters.length();i++){
            findOne(digits,index+1,s+letters.charAt(i));
        }
    }
}
