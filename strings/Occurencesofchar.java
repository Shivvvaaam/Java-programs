package strings;

import java.util.HashMap;
import java.util.Map;

public class Occurencesofchar {
    public static void occurences(String s){
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }

        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        String str = "done and gone";
        occurences(str);
    }
    
}
