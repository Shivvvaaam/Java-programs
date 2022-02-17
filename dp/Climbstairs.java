package dp;

public class Climbstairs {
    public static int stairscount(int n , int[] qb){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        if(qb[n]>0){
            return qb[n];
        }
        System.out.println("hello "+n);
        int n1 = stairscount(n-1 , qb);
        int n2 = stairscount(n-2 , qb);
        int n3 = stairscount(n-3 , qb);
        int cp = n1+n2+n3;
        qb[n] = cp;
        return cp;
    }
    public static void main(String[] args) {
        int steps = 10;
        int no_of_paths = stairscount(steps , new int[steps+1]);
        System.out.println(no_of_paths);
    }
    
}
