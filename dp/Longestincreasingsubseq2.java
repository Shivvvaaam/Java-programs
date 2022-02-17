package dp;

import java.util.ArrayDeque;

class Pair{
    int l,index,value;
    String psf;
    Pair(int l , int index , int value , String psf){
        this.l = l;
        this.index = index;
        this.value = value;
        this.psf = psf;
    }
}

public class Longestincreasingsubseq2 {
    public static void subseql(int[] arr){
        int omax = 0;
        int omi = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for(int i=0;i<dp.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    {
                        if(dp[j]>max){
                            max = dp[j];
                        }

                    }

                }

            }
            dp[i] = max+1;
            if(dp[i]>omax){
                omax = dp[i];
                omi = i;
            }       
        }
        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        queue.add(new Pair(omax, omi, arr[omi], arr[omi] + ""));

        while (queue.size()>0) {
            Pair rem = queue.removeFirst();
             
            if(rem.l==1){
                System.out.println(rem.psf);
            }
            for(int j=0;j<rem.index;j++){
                if(dp[j]==rem.l-1 && arr[j] <= rem.value){
                    queue.add(new Pair(dp[j], j, arr[j], arr[j]+"-> "+rem.psf));
                }
            }
        }


    }
    public static void main(String[] args) {
        int[] arr = {10,22,9,33,21,50,41,60,80,3};
        subseql(arr);
    }
    
}
