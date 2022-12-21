package Advanced.Day_46_Hashing;

import java.util.HashSet;

/*
 * Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.

Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.
 */

public class SubArrayZero {
    public int solve(int[] A) {
        long sum=0;
        HashSet<Long> set = new HashSet<Long>();
        for(long i=0;i<A.length;i++){
            sum=(long)(sum+A[(int) i]);
            if(set.contains(sum) || sum==0){
                return 1;
            }
            set.add(sum);
        }
        return 0;
    }
}
