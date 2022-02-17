package dp;

public class Lcsrecursive {
    public static int subseq(String x , String y , int m , int n) {
        // recursive
        // int max_len = 0;
        // if(m==0||n==0){
        //     return 0;
        // }
        // if(x.charAt(m-1)==y.charAt(n-1)){
        //     max_len = 1+subseq(x, y, m-1, n-1);
        // }
        // else{
        //     max_len = Math.max(subseq(x, y, m-1, n) , subseq(x, y, m, n-1));
        // }
        // return max_len;
        //memoization
        int[][] dp = new int[m+1][n+1];
        // if(m==0||n==0){
        //     return 0;
        // }
        // if(dp[m][n-1]!=-1){
        //     return dp[m][n];
        // }
        // if(x.charAt(m-1)==y.charAt(n-1)){
        //     dp[m][n] = 1+subseq(x, y, m-1, n-1);
        //     return dp[m][n];
        // }else{
        //     dp[m][n] = Math.max(subseq(x, y, m-1, n),subseq(x, y, m, n-1));
        //     return dp[m][n];
        // }
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
            if(i==0||j==0){
                dp[i][j]=0;
            }
        }
    }
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(x.charAt(i-1)==y.charAt(j-1)){
                dp[i][j] = 1+dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }

        }
    }
    return dp[m][n];
    }
    public static void main(String[] args) {
        String x = "abcdefgh";
        String y = "abcdooogh";
        int m = x.length();
        int n = y.length();
        System.out.println(subseq(x, y, m, n));
        
    }
    
}
