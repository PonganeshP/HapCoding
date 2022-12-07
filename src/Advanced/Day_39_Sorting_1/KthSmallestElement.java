package Advanced.Day_39_Sorting_1;

import java.util.Arrays;

/*
 * 
 * Problem Description
Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.

Example Input
Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 2


Example Explanation
Explanation 1:

 3rd element after sorting is 2.
Explanation 2:

 2nd element after sorting is 2.
 */

public class KthSmallestElement {
    public int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);
        return A[B-1];
    }
}
