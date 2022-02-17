package dp;

public class Subsetsumcount {
    // public static int subsetcount(int[] arr , int n , int sum) {
    //     int count=0;
        
    //     if(n==0){
    //         if(sum==0){
    //             count++;

    //         }
    //         return count;
    //     }
    //     else{

    //     if(arr[n-1]>sum){
    //         return count+subsetcount(arr, n-1, sum);
    //     }
    //     else{
    //     return count+subsetcount(arr, n-1, sum-arr[n-1])+subsetcount(arr, n-1, sum);
    //     }
    // }
    //dynamic programming
    public static int subsetcount(int[] arr , int n , int sum) {
        int count=0;
        int[][] dp = new int[sum+1][n+1];
        for(int i=0;i<=sum;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<=n;j++){
            dp[0][j] = 1;
        }
        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                if(arr[j-1]<=i){
                    dp[i][j] = dp[i][j-1]+dp[i-arr[j-1]][j-1];

                }else{
                    dp[i][j] = dp[i][j-1];
                }
                count = dp[i][j];

            }

        }
        
        return count;
        
    }

        
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        int n = arr.length;
        System.out.println(subsetcount(arr, n, sum));
    }
    
}
