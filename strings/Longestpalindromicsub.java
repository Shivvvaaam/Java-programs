package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Longestpalindromicsub {
    public static void palindromicsub(String s) {
        int len = 0;
        String psubstring = "";
        chr 
        Map<Character , Integer> map = new LinkedHashMap<>();
        map.put(, -1);
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char ch = arr[i];
            if(arr[i]==arr[arr.length-i-1]){
                map.put(ch, i);
            }else{
                i = map.get(ch);
                map.clear();
            }
            if(map.size()>len){
                len = map.size();
                psubstring = map.keySet().toString();
            }

        }
        System.out.println(len);
        System.out.println(psubstring);

    }
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        palindromicsub(s);
    }
    
}
