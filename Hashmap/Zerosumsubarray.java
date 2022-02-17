package Hashmap;

import java.util.HashMap;

public class Zerosumsubarray {
    public static void  subarray(int[] arr) {
        int maxlength = 0;
        int i = -1;
        int sum = 0;
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(sum, i);
        while (i<arr.length-1) {
            i++;
            sum = sum+arr[i];
            if(!map.containsKey(sum)){
                map.put(sum, i);

            }else{
                count++;
                int len = i-map.get(sum);
                if(len>maxlength){
                    maxlength = len;
                }
            }
        }
        System.out.println(count);
        System.out.println(maxlength);
    }
    public static void main(String[] args) {
        int[] arr = {2 , 8 , -3 , -5 , 2 , -4 , 6 , 1 , 2 , 1 , -3 , 4};
        subarray(arr);
    }
}
