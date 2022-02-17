package dp;

public class Rodcutting {
    public static int  profit(int[] len , int[] price , int total ,int n) {
        int max_value=0;
        if(total==0||n==0){
            return 0;
        }
        if(len[n-1]<=total){
            max_value =   Math.max(price[n-1]+profit(len, price, total-len[n-1], n-1) , profit(len, price, total, n-1));
        }
        else if(len[n-1]>total){
            max_value = profit(len, price, total, n-1);
        }
        return max_value;
        
    }
    public static void main(String[] args) {
        int[] len = {1  , 2 ,  3  , 4  , 5 ,  6 ,  7 ,  8  };
        int[] price = { 1 ,  5  , 8 ,  9 , 10 , 17 , 17 , 20};
        int total = 8;
        int n = len.length;
        int max = profit(len, price, total, n);
        System.out.println(max);
    }
    
}
