package Code_99_Contest.Contest_156;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Code_5205 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        Set<Integer> set=new HashSet<>();
        for(Integer i:map.values()){
            if(set.contains(i))
                return false;
            else
                set.add(i);
        }
        return true;

    }

    public static void main(String[] args) {
        new Code_5205().uniqueOccurrences(new int[]{1,2,2,1,1,3});
    }
}
