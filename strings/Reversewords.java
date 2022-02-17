import java.util.*;
public class Reversewords{
    public static String reverse(String str){
        String ans = "";
        int i = str.length()-1;
        while (i>=0) {
            while (i>=0 && str.charAt(i)==' ') {
                i--;
            }
            int j = i;
            while (i>=0 && str.charAt(i) !=' '){
                i--;
            }
            if(ans.isEmpty()){
                ans = ans.concat(str.substring(i+1, j+1));
            }
            else{
                ans = ans.concat(" " + str.substring(i+1, j+1));

            }
           i--;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(reverse(str));
        

    }
}