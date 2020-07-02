package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Code_093 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine().trim());
        int[] arr=new int[n];
        String[] s=reader.readLine().trim().split(" ");
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        System.out.println(getRes(arr));

    }
    private static int getRes(int[] arr){
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                int count=0;
                int left=arr[i]-1;
                int right=arr[i]+1;
                if(map.containsKey(left)){
                    count+=map.get(left);
                    left=left-map.get(left)+1;
                }
                if(map.containsKey(right)){
                    count+=map.get(right);
                    right=right+map.get(right)-1;
                }
                int total=1+count;
                res=Math.max(res,total);
                map.put(arr[i],total);

                if(map.containsKey(left))
                    map.put(left,total);
                if(map.containsKey(arr[i]+1))
                    map.put(right,total);
            }
        }
        return res;
    }
}
