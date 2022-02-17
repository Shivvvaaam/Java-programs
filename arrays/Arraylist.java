package arrays;

import java.util.*;

public class Arraylist {
    public static int minindex(List<Integer> planets){
        int sum_of_even = 0;
        int sum_of_odd = 0;
        int i = 0;
        while (i<planets.size()) {
            
            for(int j=0;j<planets.size();j+=2){
                sum_of_even = sum_of_even+planets.get(j)-planets.get(i);
            }
            for(int k=0;k<planets.size();k++){
                sum_of_odd = sum_of_odd+planets.get(k)-planets.get(i);
            }
            if(sum_of_even==sum_of_odd){
                break;
            }
            i++;
        }
        return i;

    }
    public static void main(String[] args) {
        List<Integer> planets = new ArrayList<Integer>();
        planets.add(2);
        planets.add(4);
        planets.add(6);
        planets.add(3);
        planets.add(4);
        System.out.println(minindex(planets));


    }
    
}
