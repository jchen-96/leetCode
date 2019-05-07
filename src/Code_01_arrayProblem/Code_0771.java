package Code_01_arrayProblem;


import java.util.HashMap;

//https://leetcode-cn.com/problems/jewels-and-stones/
public class Code_0771 {
    public int numJewelsInStones(String J, String S) {
        if(S.length()<=0||J.length()<=0)
            return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        char[] toCharArray=S.toCharArray();
        for(char c:toCharArray){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] resChars=J.toCharArray();
        int res=0;
        for(char c:resChars){
            if(map.containsKey(c))
                res+=map.get(c);
        }
        return res;
    }

    public static void main(String[] args) {
        Code_0771 code_0771=new Code_0771();
        System.out.println(code_0771.numJewelsInStones("aA","aAAbbbb"));
    }
}
