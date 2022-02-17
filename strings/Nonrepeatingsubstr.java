package strings;

import java.util.Arrays;

public class Nonrepeatingsubstr {
    public static boolean checkrep(String s , int start , int end) {
        int[] visited = new int[256];
        Arrays.fill(visited, 0);

        for(int i = start ; i<=end ; i++){
            char c = s.charAt(i);
            visited[c]++;

            if(visited[c]>1){
                return false;
            }
        }
        return true;

    }
    public static int substrlen(String s){
        int maxlen = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(checkrep(s, i, j)==true){
                    maxlen = Math.max(maxlen , j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcaabcdba";
        System.out.println(substrlen(s));
    }
    
}
