package recursion;

public class Lastindexofoccurence {
    public static int li(int[] arr , int idx , int x){
        if(idx == 0){
            return -1;
        }
        if(arr[idx] == x){
            return x;
        }else{
            int liisa = li(arr, idx-1, x);
            return liisa;
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,6,9,8,3,2,6,2,4,3};
        int x = 3;
        System.out.println(li(arr , arr.length-1 , x));
    }
}
