package arrays;

import java.util.HashMap;

public class Removeduplicates {
    public static void remove(int[] arr , int n) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        map.forEach((k, v) -> System.out.print(k + " "));

    }
    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 6, 4, 4, 5, 6, 8, 7 };
        int n = arr.length;
        remove(arr, n);
    }
    
}
