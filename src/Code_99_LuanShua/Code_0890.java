package Code_99_LuanShua;

//https://leetcode-cn.com/problems/find-and-replace-pattern/

import java.util.*;

//no need  to read

public class Code_0890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList<>();
        for (String word:words){
            if(word.length()!=pattern.length())
                continue;

            char[] cc=word.toCharArray();
            char[] patterns=pattern.toCharArray();
            Map<Character,Character> maps=new HashMap<>();
            int i;
            for (i=0;i<patterns.length;i++){
                if(maps.containsKey(patterns[i])){

                    if(maps.get(patterns[i])!=cc[i])
                        break;
                }else{
                    if(maps.containsValue(cc[i]))
                        break;
                    maps.put(patterns[i],cc[i]);
                }
            }
            if(i==patterns.length)
                result.add(word);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("teset");
        List<String> ss=new Code_0890().findAndReplacePattern(new String[]{"abc"},"abb");

    }
}
