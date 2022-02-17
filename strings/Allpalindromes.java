package strings;

public class Allpalindromes {
    public static void main(String[] args) {
        String str = "babaabab" ;
    

    for(int i=0;i<str.length();i++){
        for(int j = i;j<str.length();j++){
            boolean flag = false;
            for(int k=i;k<(j-i-1)/2;k++){
                if(str.charAt(k)==str.charAt(j-i-1/2)){
                    flag = true;
                }

            }
            if(flag=true){
                System.out.println(str.substring(i, j));
            }

        }

    }
        
    }
    
    
}

