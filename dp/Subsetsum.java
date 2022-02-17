package dp;

public class Subsetsum {
    //recursive
    public static boolean subset(int[] arr , int sum , int n) {
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(arr[n-1]>sum){
            return subset(arr, sum, n-1);
        }
        else{
            return subset(arr, sum, n-1) || subset(arr, sum-arr[n-1], n-1);


        }
    }
    // public static boolean subset(int[] arr , int sum ,int n) {
    //     boolean[][] dp= new boolean[sum+1][n+1];
    //     for(int i=0;i<=sum;i++){
    //         dp[i][0] = false;
    //     }
    //     for(int j=0;j<=n;j++){
    //         dp[0][j] = true;
    //     }
    //     for (int i = 1; i <= sum; i++) {
    //         for (int j = 1; j <= n; j++) {
    //             dp[i][j] = dp[i][j - 1];
    //             if (i >= arr[j - 1])
    //                 dp[i][j] = dp[i][j]
    //                                || dp[i - arr[j - 1]][j - 1];
    //         }
    //     }
    //     return dp[sum][n];
    // }

        

    public static void main(String[] args) {
        int[] arr = {3,34,4,12,5,2};
        int sum = 9;
        boolean check = subset(arr, sum, arr.length);
        System.out.println(check);
    }
}
