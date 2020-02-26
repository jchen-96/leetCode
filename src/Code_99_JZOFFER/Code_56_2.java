package Code_99_JZOFFER;

import java.util.HashSet;
import java.util.Set;

public class Code_56_2 {
//    简单方法
    public int singleNumber_1(int[] nums) {
        Set<Long> set = new HashSet<>();
        long sumSet = 0, sumArray = 0;
        for(int n : nums) {
            sumArray += n;
            set.add((long)n);
        }
        for(Long s : set) sumSet += s;
        return (int)((3 * sumSet - sumArray) / 2);
    }
    
}
