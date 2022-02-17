package arrays;

import java.util.Arrays;

public class Mergetwoarrays {
    public static int[] mergearrays(int[] arr1 , int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            }
            else {
                res[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i<arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
    public  static void  printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2,5,12,18,20};
        int arr2[] = {7,9,11,15,28,30,35};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] res = mergearrays(arr1, arr2);
        printarray(res);

    }
}
