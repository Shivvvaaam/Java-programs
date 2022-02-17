package bit_manipulation;

import java.util.Scanner;

public class Evennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<=n;i++){
            if((i & 1)==0){
                System.out.print(i + " ");
    
            }
            

        };
    }
    
}
