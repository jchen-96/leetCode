package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Code_010 {
    public static void main(String[] args)throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int[] arr=new int[n];
        String[] s=reader.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                arr[i]=1;
            else if(arr[i]<0)
                arr[i]=-1;
        }
        System.out.println(getRes(arr));
    }
    private static int getRes(int[] arr){
        int res=-1;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                res=Math.max(res,i-map.get(sum));
            }
            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return res;
    }
}
