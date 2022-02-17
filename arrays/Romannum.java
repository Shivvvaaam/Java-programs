package arrays;

import java.util.*;
public class Romannum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int[] arr = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };;
	    String[] ch = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	    StringBuilder rom = new StringBuilder();
	    int num = sc.nextInt();
	    for(int i=0;i<arr.length;i++){
	        while(num>=arr[i]){
	            num -= arr[i];
	            rom = rom.append(ch[i]);
	        }
	    }
	    System.out.println("Roman:" +rom.toString());
	    
	    
    }
}
