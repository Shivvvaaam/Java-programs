package arrays;

import java.util.ArrayList;

public class Firstnegativeink {
    public static ArrayList<Integer> knegative(int[] arr , int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length-k+1;i++){
            boolean flag = false;
            for(int j=0;j<k;j++){
                if(arr[i+j]<0){
                    flag=true;
                    list.add(arr[i+j]);
                    break;

                }
            }
            if(!flag){
                list.add(0);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6 , -11, 10};
        int k = 2;
        System.out.println(knegative(arr, k));
    }
    
}

