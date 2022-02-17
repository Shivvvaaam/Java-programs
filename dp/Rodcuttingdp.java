package dp;

public class Rodcuttingdp {
    public static int maxprofit(int[] len , int[] price , int total , int n) {
        int[][] dp = new int[total+1][n+1];
        for(int i=0;i<=total;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]=0;

                }
            }
        }
        for(int i=1;i<=total;i++){
            for(int j=1;j<=n;j++){
                if(len[j-1]<=i){
                    dp[i][j] = Math.max(price[j-1]+dp[i-len[j-1]][j-1], dp[i][j-1]);
                }
                else{
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
       return dp[total][n];
    }
    public static void main(String[] args) {
        int[] len = {1  , 2 ,  3  , 4  , 5 ,  6 ,  7 ,  8  };
        int[] price = { 1 ,  5  , 8 ,  9 , 10 , 17 , 17 , 20};
        int total = 8;
        int n = len.length;
        int max = maxprofit(len, price, total, n);
        System.out.println(max);
    }
}
