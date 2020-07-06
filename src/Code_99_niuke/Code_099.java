package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Code_099 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String target = reader.readLine();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
        }
        System.out.println(findIndex(arr, target));

    }

    public static int findIndex(String[] arr, String target) {
        if (arr == null || arr.length == 0)
            return -1;
        int l = 0;
        int r = arr.length - 1;
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (!arr[mid].equals("0") && arr[mid].equals(target)) {
                res = mid;
                r = mid - 1;
            } else if (!arr[mid].equals("0")) {
                if(arr[mid].compareTo(target)<0){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }else{
                int i=mid;
                while (i>=l&&arr[i].equals("0"))
                    i--;
                if(i<l||arr[i].compareTo(target)<0){
                    l=mid+1;
                }else{
                    r=i;
                }
            }
        }
        return res;
    }
}
