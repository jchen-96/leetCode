package Code_99_HOT_100;

import java.util.HashMap;
import java.util.Map;

public class Code_0621 {
    public int leastInterval(char[] tasks, int n) {
        if(tasks==null||tasks.length<=0)
            return 0;
        if(n==0)
            return tasks.length;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i< tasks.length;i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i],map.get(tasks[i])+1);
            }else{
                map.put(tasks[i],1);
            }
        }
        int max=-1;
        int max_count=0;
        for(char c:map.keySet()){
            if(map.get(c)>max){
                max=map.get(c);
                max_count=1;
            }else if(map.get(c)==max){
                max_count++;
            }
        }
        int t=(max-1)*(n+1)+max_count;
        return t> tasks.length?t:tasks.length;

    }
}
