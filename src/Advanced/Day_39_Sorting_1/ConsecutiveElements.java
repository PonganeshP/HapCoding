package Advanced.Day_39_Sorting_1;

import java.util.Arrays;

/*
 * Problem Description
Given an array of positive integers A, check and return whether the array elements are consecutive or not.
NOTE: Try this with O(1) extra space.



Example Input
Input 1:

 A = [3, 2, 1, 4, 5]
Input 2:

 A = [1, 3, 2, 5]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 As you can see all the elements are consecutive, so we return 1.
Explanation 2:

 Element 4 is missing, so we return 0.
 */

public class ConsecutiveElements {
    public int solve(int[] A) {
        Arrays.sort(A);
        for(int i=1;i<A.length;i++){
            if((A[i]-A[i-1]) != 1){
                return 0;
            }
        }
        return 1;
    }
}
