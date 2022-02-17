package Basic;

public class Palindrome { 
    public static void main(String[] args) {
        int rem = 0;
        int sum = 0;
        int temp;
        for (int i = 1; i <= 100; i++) {
            temp = i;
            sum = 0;
            while (temp != 0) {
                rem = temp % 10;
                temp /= 10;
                sum = sum * 10 + rem;
            }

            if (i == sum)
                System.out.print(i + " ");
        }
    }
}
    
