package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Firstnegativeink2 {
    private static int[] negativeint(int[] a, int k) {
        int n = a.length;
        int[] firstNegativeNumbers = new int[n - k + 1];
        int idx = 0;

        Queue<Integer> q = new LinkedList<>();

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            if (a[windowEnd] < 0) {
                q.add(a[windowEnd]);
            }

            if (windowEnd - windowStart + 1 == k) { // Calculate result and Slide the window
                if (q.isEmpty()) {
                    firstNegativeNumbers[idx++] = 0;
                } else {
                    int num = q.peek();
                    firstNegativeNumbers[idx++] = num;

                    // Remove a[windowStart] from the queue since we need to slide the window now.
                    // But only if it was added to the queue previously
                    if (num == a[windowStart]) {
                        q.remove();
                    }
                }
                windowStart++; // Slide the window ahead
            }
        }

        return firstNegativeNumbers;
        

        
    }
    public static void main(String[] args) {
        int[] arr = {12 , -1 , -7 , 8 , -15 , 30 , 16 , 28};
        int k = 3;
        System.out.println(negativeint(arr , k));
    }
}
