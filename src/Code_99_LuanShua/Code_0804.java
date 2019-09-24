package Code_99_LuanShua;

import java.util.HashSet;
import java.util.Set;


//no need to read

public class Code_0804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] map=new String[]
                {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> result=new HashSet<>();
        for(String s:words){
            String temp="";
            char[] cs=s.toCharArray();
            for(char c:cs){
                temp+=map[c-'a'];
            }
            result.add(temp);
        }
        return result.size();
    }
}
