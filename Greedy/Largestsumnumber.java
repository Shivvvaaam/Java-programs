package Greedy;

public class Largestsumnumber {
    public static void sumnum(int m , int s) {
        int[] fill = new int[m];
        for(int i=0;i<m;i++){
            if(s>=9){
                fill[i] = 9;
                s = s-9;
            }
            else{
                fill[i] = s;
                s=0;

            }
        }
        for (int i = 0; i < fill.length; i++) {
            System.out.print(fill[i]);
        }
    }
    public static void main(String[] args) {
        int m = 3;
        int s = 20;
        sumnum(m, s);
    }
}
