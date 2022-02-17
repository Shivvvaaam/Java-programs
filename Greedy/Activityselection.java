package Greedy;

import java.util.ArrayList;

public class Activityselection {
    public static ArrayList<Integer>  activitynum(int[] start , int[] end) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        list.add(j);
        for(int i=1;i<start.length;i++){
            if(start[i]>=end[j]){
                list.add(i);
                j = i;


            }

        }
        return list;
    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(activitynum(start, end));

    }
    
}
