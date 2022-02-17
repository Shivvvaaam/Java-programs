package recursion;

public class Firstindexofoccurence {
    public static int firstindex(int[] arr , int idx , int x){
        if(idx == arr.length){
            return -1;

        }
        if(arr[idx] == x){
            return idx;
        }else{
            int fissa = firstindex(arr, idx+1, x);
            return fissa;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6,9,8,3,2,6,2,4,3};
        int x = 3;
        System.out.println(firstindex(arr, 0, x));
        
        // int i = 0;
        // int j = arr.length-1;
        // int index = -1;
        // while (i<=j) {
        //     if(arr[i] == key &&  arr[j] == key){
        //         if(i<j){
        //             index = i;
        //             break;
        //         }
        //     }
        //     i++;
        //     j--;
        // }
        // System.out.println(index);
    }
}
