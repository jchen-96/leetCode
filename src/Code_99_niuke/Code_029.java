package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Code_029 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine().trim());
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            String[] s=reader.readLine().trim().split(" ");
            arr[i][0]=Integer.parseInt(s[0]);
            arr[i][1]=Integer.parseInt(s[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?o1[0]-o2[0]:o2[1]-o1[1];
            }
        });
        int[] a=new int[arr.length];
        for(int i=0;i<a.length;i++){
            a[i]=arr[i][1];
        }
        System.out.println(getdp(a));


    }

    private static int getdp(int[] arr){
        int[] dp=new int[arr.length];
        int[] ends=new int[arr.length];
        ends[0]=arr[0];
        int rihgt=0;
        for(int i=1;i<arr.length;i++){
            int idx=Arrays.binarySearch(ends,0,rihgt+1,arr[i]);
            while (idx>=0){
                idx=Arrays.binarySearch(ends,idx+1,rihgt+1,arr[i]);
            }
            idx=-idx-1;
            rihgt=Math.max(rihgt, idx);
            ends[idx]=arr[i];
            dp[i]=idx+1;
        }
        return rihgt+1;
    }
}
