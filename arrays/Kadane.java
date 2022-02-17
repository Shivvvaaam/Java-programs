package arrays;

public class Kadane {
    public static int subarraysum(int[] arr) {
        int max_sum = 0;
        int curr_sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                curr_sum = 0;
            }
            else{
                curr_sum = curr_sum+arr[i];
            }
            if (curr_sum>max_sum) {
                max_sum = curr_sum;
            }
        }
        return max_sum;
        
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(subarraysum(arr));
    }
}
