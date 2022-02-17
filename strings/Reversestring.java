public class Reversestring {
    public static String reversreString(String str){
        String str2 = " ";
        int i = str.length()-1;
        while (i >= 0) {
            str2 = str2 + str.charAt(i);
            i--;
        }
        return str2;
    }
    public static void main(String[] args) {
        String str = "shivam";
        System.out.println(reversreString(str));
        
    }
}
