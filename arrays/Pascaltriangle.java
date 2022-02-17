package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascaltriangle {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numrows = sc.nextInt();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row = null , pre = null;
        for(int i=0;i<numrows;++i){
            row = new ArrayList<>();
            for(int j=0;j<=i;++j){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = row;
            res.add(row);
        }
        System.out.println(res);
        
    }
    
}
