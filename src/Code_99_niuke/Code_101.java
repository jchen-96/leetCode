package Code_99_niuke;

import java.util.*;
import java.io.*;

public class Code_101{
    public static void main(String[] args)throws Exception{
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(r.readLine());
        String[] s=r.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        StringBuilder sb=new StringBuilder();
        int[][] res=getRes(arr);
        for(int i=0;i<res.length;i++){
            for(int t:res[i])
                sb.append(t).append(" ");
            System.out.println(sb);
            sb.delete(0,sb.length());
        }
    }

    private static int[][] getRes(int[] arr){
        int[][] res=new int[arr.length][2];
        Stack<Integer> stack=new Stack();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&&arr[stack.peek()]>arr[i]){
                int cur=stack.pop();
                if(stack.isEmpty()){
                    res[cur]=new int[]{-1,i};
                }else{
                    res[cur]=new int[]{stack.peek(),i};
                }
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int cur=stack.pop();
            if(!stack.isEmpty()){
                res[cur]=new int[]{stack.peek(),-1};
            }else{
                res[cur]=new int[]{-1,-1};
            }
        }
        return res;

    }
}
