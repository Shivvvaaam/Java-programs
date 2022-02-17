package arrays;

import java.util.Arrays;

public class Minimumjumps {
    public static int jumps(int[] arr){
        int min=Integer.MAX_VALUE;
        int[] dp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0]=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr[i]+i && j<arr.length;j++){
                dp[j] = Math.min(dp[j] , 1+dp[i]);
            }
           
        }
        return dp[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(jumps(arr));
    }
    
}
