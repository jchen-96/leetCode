package weekContest.week130;

import java.util.ArrayList;
import java.util.List;


// no need to read
public class Code_1029 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            temp = temp * 2 + A[i];
            temp = temp % 5;
            if (temp % 5 == 0) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
