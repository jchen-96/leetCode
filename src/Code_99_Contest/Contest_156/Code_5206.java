package Code_99_Contest.Contest_156;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_5206 {
    public String removeDuplicates(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();


        char[] ttt=s.toCharArray();
        for (int i = 0; i <ttt.length ; i++) {
            if(map.containsKey(ttt[i]))
                map.put(ttt[i],map.get(ttt[i])+1);
            else
                map.put(ttt[i],1);
        }

        List<String> repeated = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; ++i) {
            sb.setLength(0);
            for(int count=0;count<k;count++) {
                sb.append(i);
            }
            repeated.add(sb.toString());
        }

        int originlen = -1;
        while (originlen != s.length()) {
            originlen = s.length();
            for (String d : repeated)
                if(map.containsKey(d.charAt(0))&&map.get(d.charAt(0))>=k)
                    s = s.replace(d, "");
        }

        return s;
    }
}
