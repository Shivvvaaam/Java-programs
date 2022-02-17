package arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static int chocolate(int[] arr , int m){
        
        int diff , min_diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i+m-1<arr.length;i++){
            diff = arr[i+m-1]-arr[i];
            if(diff<min_diff){
                min_diff = diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,9,12,56};
        int m = 3;
        System.out.println(chocolate(arr, m));
    }
}
