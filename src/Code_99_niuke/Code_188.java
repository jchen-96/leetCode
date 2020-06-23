package Code_99_niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_188 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] s = r.readLine().split(" ");
        r.close();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        StringBuilder sb = new StringBuilder();
        int[][] res = getRes(arr);
        for (int i = 0; i < res.length; i++) {
            for (int t : res[i])
                sb.append(t).append(" ");
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    private static int[][] getRes(int[] arr) {
        int[][] res = new int[arr.length][2];
        Stack<List<Integer>> stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek().get(0)] > arr[i]) {
                List<Integer> list=stack.pop();
                if (stack.isEmpty()) {
                    for(int t:list){
                        res[t]=new int[]{-1,i};
                    }
                } else {
                    int left=stack.peek().get(stack.peek().size()-1);
                    for(int t:list){
                        res[t]=new int[]{left,i};
                    }
                }
            }
            if(!stack.isEmpty()&&arr[stack.peek().get(0)]==arr[i]){
                stack.peek().add(i);
            }else{
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()) {
            List<Integer> list=stack.pop();
            if (stack.isEmpty()) {
                for(int t:list){
                    res[t]=new int[]{-1,-1};
                }
            } else {
                int left=stack.peek().get(stack.peek().size()-1);
                for(int t:list){
                    res[t]=new int[]{left,-1};
                }
            }
        }
        return res;

    }
}
