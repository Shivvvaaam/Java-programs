package recursion;

public class Stringpowerset {
    public static void powerset(String str , int i , String curr){
        
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        powerset(str, i+1, curr+str.charAt(i));
        powerset(str, i+1, curr);
    }
    public static void main(String[] args) {
        String str = "abc";
        int i = 0;
        String curr = "";
        powerset(str, i, curr);
        System.out.println(str.length());
    }
}
