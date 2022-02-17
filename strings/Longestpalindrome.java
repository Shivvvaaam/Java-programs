package strings;

import java.util.*;
public class Longestpalindrome {
    public static void printstring(String str , int start , int max_length){
        for(int i=start;i<max_length;i++){
            System.out.print(str.charAt(i));
        }
    }
    public static int palindrome(String str) {
        int max_length = 1;
        int n = str.length();
        int start=0;
        
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int k=0;k<j-i+1/2;k++){
                    if(str.charAt(i+k)!=str.charAt(j-k)){
                        flag = false;
                    }
                }
                if(flag=true && j-i+1 > max_length){
                    start = i;
                    max_length = j-i+1;
                }
            }
        }
        printstring(str, start, start+max_length-1);
        return max_length;
    }
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
       
        System.out.println(palindrome(str));
    }
}
