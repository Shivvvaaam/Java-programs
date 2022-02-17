package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Subarraywithgivensum {
    public static void subarraysum(int[] arr , int sum) {
        // for(int i=0;i<arr.length-1;i++){
        //     int curr_sum = arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         if(curr_sum==sum){
        //             int p = j-1;
        //             System.out.println("Elements found at " + i + " " +p);
                    
        //         }
        //         if(curr_sum>sum||j==arr.length){
        //             break;

        //         }
        //         curr_sum = curr_sum+arr[j];
        //     }

        // }
        // int start = 0;
        // int end = -1;
        // int curr_sum = 0;
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     curr_sum = curr_sum+arr[i];
        //     if(curr_sum-sum==0){
        //         start = 0;
        //         end = i;
        //         break;
        //     }
        //     if(map.containsKey(curr_sum-sum)){
        //         start = map.get(curr_sum-sum)+1;
        //         end = i;

        //     }
        //     map.put(curr_sum, i);
        //     if(end==-1){
        //         System.out.println("no sum is present");
        //     }else{
        //         System.out.println("Sum found between:" +start+ " " +end);
        //     }
        // }

    }
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 33;
        subarraysum(arr, sum);
    }
        
    
    
}
