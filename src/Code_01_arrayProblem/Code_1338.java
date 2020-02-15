package Code_01_arrayProblem;

import java.util.HashMap;
import java.util.Map;

public class Code_1338 {
    public int minSetSize(int[] arr) {
        int res = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            Integer integer = map.getOrDefault(num, 0);
            map.put(num, integer + 1);
            max = Math.max(max, integer + 1);
        }

        int[] helper = new int[max + 1];


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            helper[entry.getValue()]++;
        }
        int len = 0;
        for(int i = max; i >= 1;) {
            if (helper[i] != 0) {
                len += i;
                helper[i]--;
                res++;
                if(len >= arr.length / 2) {
                    return res;
                }
            } else {
                i--;
            }
        }
        return res;
    }
}
