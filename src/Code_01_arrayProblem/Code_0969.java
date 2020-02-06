package Code_01_arrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Code_0969 {
    public List<Integer> pancakeSort(int[] A) {
        if (A == null || A.length <= 1)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = A.length - 1; i > 0; i--) {
            int max_index = getMaxIndex(A, 0, i);
            if(max_index==i)
                continue;
            if (max_index > 0) {
                reverse(A, max_index + 1);
                res.add(max_index + 1);
            }
            reverse(A, i + 1);
            res.add(i + 1);
        }
        return res;

    }

    private int getMaxIndex(int[] arr, int start, int end) {
        int res = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[res])
                res = i;
        }
        return res;
    }

    private void reverse(int[] arr, int k) {
        int l = 0;
        int r = k - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}


