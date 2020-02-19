package Code_99_JZOFFER;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Code_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k);
    }
}
