package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Printzerosumsubarray {
    public static void  subarray(int[] arr) {
        int maxlength = 0;
        int i = -1;
        int sum = 0;
        int len = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        map.put(sum, i);
        while (i<arr.length-1) {
            i++;
            sum = sum+arr[i];
            if(!map.containsKey(sum)){
                map.put(sum, i);

            }else{
                len = i-map.get(sum);
                for(int j = len;j<=i;j++){
                    list.add(arr[j]);

                }
                System.out.println(list);

            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {2 , 8 , -3 , -5 , 2 , -4 , 6 , 1 , 2 , 1 , -3 , 4};
        subarray(arr);
    }
    
}
