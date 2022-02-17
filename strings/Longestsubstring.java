package strings;

import java.util.LinkedHashMap;
import java.util.Map;

//longest substring without repeating charachters.
public class Longestsubstring {
    public static void longestsubstring(String s){
        String lsubstring = "";
        int length = 0;
        Map<Character , Integer> map = new LinkedHashMap<Character , Integer>();
        char[] arr = s.toCharArray();
        for(int i= 0 ; i<arr.length;i++){
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }else{
                i = map.get(ch);
                map.clear();
            }
            if (map.size()>length) {
            lsubstring = map.keySet().toString();
            length = map.size();
            }
            

        }
        System.out.println(lsubstring);
        System.out.println(length);

    }
    public static void main(String[] args) {
        String s = "abbac";
        longestsubstring(s);
    }
}
