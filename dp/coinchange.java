package dp;

import java.util.Arrays;

public class coinchange {
    public static int mincoins(int n , int[] a , int[] dp){
        int ans = Integer.MAX_VALUE;
        if(n==0) {
            return 0;
        }
        for(int i=0;i<a.length;i++){
            if(n-a[i]>=0){
                int subans = 0;
                if(dp[n-a[i]] != -1){
                    subans = dp[n-a[i]];
                }
                else{
                    subans = mincoins(n-a[i], a , dp);

                }

                    
                if(subans!=Integer.MAX_VALUE && subans+i<ans){
                        ans = subans+1;
                    }

                }
                

            }
            return dp[n] = ans;
            
        }
    
        
        


    
    public static void main(String[] args) {
        int n = 18;
        int[] arr = {1 , 5 , 7};
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int ans = mincoins(n, arr , dp);
        System.out.println(ans);
    }
}
