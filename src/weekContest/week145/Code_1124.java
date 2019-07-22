package weekContest.week145;

public class Code_1124 {
    public int longestWPI(int[] hours) {


        int[] dp = new int[hours.length];
        int[] start = new int[hours.length];
        int[] end = new int[hours.length];
        int[] diff = new int[hours.length];
        int nn = 0;
        for (; nn < hours.length; ) {
            if (hours[nn] > 8) {
                dp[nn] = 1;
                start[nn] = nn;
                end[nn] = nn;
                diff[nn] = 1;
                nn++;
                break;
            } else {
                nn++;
            }
        }
        for (int i = nn; i < dp.length; i++) {
            if (hours[i] > 8) {
                if (end[i - 1] == i - 1) {
                    dp[i] = dp[i - 1] + 1;
                    end[i] = i;
                    diff[i] = diff[i - 1] + 1;
                    for (int m = start[i - 1] - 1; m >= 0; m--) {
                        if (hours[m] <= 8) {
                            if (diff[i] > 1) {
                                start[i] = m;
                                diff[i]--;
                                dp[i]++;
                            } else {
                                break;
                            }
                        } else {
                            start[i] = m;
                            diff[i]++;
                        }
                    }

                } else {

                    int t1 = 0;
                    int t2 = 0;
                    for (int k = end[i - 1] + 1; k <= i; k++) {
                        if (hours[k] > 8) {
                            t1++;
                        } else {
                            t2++;
                        }
                        if (t1 == t2) {
                            dp[i] = dp[i - 1] + i - end[i - 1];
                            start[i] = start[i - 1];
                            end[i] = i;
                            diff[i] = diff[i - 1];
                        } else {
                            dp[i] = dp[i - 1];
                            start[i] = start[i - 1];
                            end[i] = end[i - 1];
                            diff[i] = diff[i - 1];
                        }

                    }
                    if(t1<t2-2&&dp[i-1]==1){
                        dp[i]=1;
                        start[i]=i;
                        end[i]=i;
                        diff[i]=1;
                    }
                }
            } else {
                if (end[i - 1] == i - 1 && diff[i - 1] > 1) {
                    dp[i] = dp[i - 1] + 1;
                    start[i] = start[i - 1];
                    end[i] = i;
                    diff[i] = diff[i - 1] - 1;
                } else {
                    dp[i] = dp[i - 1];
                    start[i] = start[i - 1];
                    end[i] = end[i - 1];
                    diff[i] = diff[i - 1];
                }
            }
        }
        return dp[hours.length - 1];

    }
}
