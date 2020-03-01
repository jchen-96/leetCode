package Code_03_Dynamic;

public class Code_0303 {

}

class NumArray {

    private int[] arr;
    private int[] dp;

    public NumArray(int[] nums) {
        arr = nums;
        dp = new int[nums.length];
        if (nums != null && nums.length > 0) {
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i - 1 < 0)
            return dp[j];
        return dp[j] - dp[i - 1];
    }
}