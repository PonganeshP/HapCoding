package Advanced.Day_39_Sorting_1;

import java.util.Arrays;

/*
 * Problem Description
Given an array A of N integers where the i-th element represent the number of chocolates in the i-th packet.

There are B number of students, the task is to distribute chocolate packets following below conditions:

1. Each student gets one packet.
2. The difference between the number of chocolates given to any two students is minimum.
Return the minimum difference (that can be achieved) between the student who gets minimum number of chocolates and the student who gets maximum number of chocolates.



Example Input
Input:

  A : [3, 4, 1, 9, 56, 7, 9, 12]
  B : 5


Example Output
Output:

  6


Example Explanation
Explanation:

  
  We can choose the packets with chocolates = [3, 4, 9, 7, 9]
  The difference between maximum and minimum is 9-3 = 6
 */

public class ChocolateDistribution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        if(A.length<1 || B==0){
            return 0;
        }
        int min=A[B-1] - A[0];
        for(int i=1;i<A.length-B;i++){
            min=Math.min(A[i+B-1]-A[i],min);
        }
        return min;
    }
}
