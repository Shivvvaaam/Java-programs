package arrays;

public class Kmaximumsum {
    public static int ksum(int[] arr , int k) {
        int max = Integer.MIN_VALUE;
        int i =0;
        int j = 0;
        int sum = 0;
        while(j<arr.length){
            sum = sum+arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(sum, max);
                sum = sum-arr[i];
                i++;
                j++;
            }
            


        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        System.out.println(ksum(arr, k));
    }
}
