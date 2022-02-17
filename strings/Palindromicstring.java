import java.util.*;
public class Palindromicstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        boolean flag = true;
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                flag = false;
                // break;
            }

        }
        if(flag){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
