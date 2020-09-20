import java.util.*;
import java.io.*;

public class Main {


    //n个物品，每个物品的重量为wi,价值为vi ,背包的最大值为target
    private static int getRes(int[] ws, int[] vs, int n, int target) {
        int[] dp = new int[target + 1];
        //dp[i][j]表示前i个物品，容量不超过j。
        for (int i = 1; i <= n; i++) {
            for (int j = ws[i - 1]; j <= target; j++) {
                dp[j] = Math.max(dp[j], dp[j - ws[i - 1]] + vs[i - 1]);
            }
        }
        return dp[target];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = reader.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int[] vol = new int[n];
        int[] price = new int[n];
        int[] nums=new int[n];
        int m = Integer.parseInt(ss[1]);
        for (int i = 0; i < n; i++) {
            ss = reader.readLine().split(" ");
            vol[i] = Integer.parseInt(ss[0]);
            price[i] = Integer.parseInt(ss[1]);
            nums[]
        }
        System.out.println(getRes(ws, vs, n, m));
    }
}