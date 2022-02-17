package dp;

public class Maximumincreasingsubseq {
    public static int subseq(int[] arr){
        int[] dp = new int[arr.length];
        int omax = 0;
        for(int i=0;i<dp.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(dp[j]>max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            if(dp[i]>omax){
                omax = dp[i];
            }
        }
        return omax;
    }
}
