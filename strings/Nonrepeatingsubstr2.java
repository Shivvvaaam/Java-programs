package strings;

import java.util.HashSet;
import java.util.Set;

public class Nonrepeatingsubstr2 {
    public static int substrlen(String s) {
        int maxlen = 0;
        int l , r;
        Set<Character> set = new HashSet<>();
        l = 0;
        r = 0;
        while(r<s.length()){
            set.add(s.charAt(r));
            if(set.contains(s.charAt(r))){
                l = Math.max(l, )
            }

            
        }

        return maxlen;
    }
}
