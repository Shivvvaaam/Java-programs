package recursion;

import java.util.Scanner;

public class Towerofhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        toh(n, d1, d2, d3);

    }
    public static void toh(int n,int d1,int d2,int d3){
        if(n==0){
            return;
        } 
        toh(n-1,d1,d3,d2);
        System.out.println(n + " " + d1 + " to " + d2);
        toh(n-1, d3, d2, d1);

    }
    
}
