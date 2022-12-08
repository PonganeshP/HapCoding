package Advanced.Day_41_Sorting_3;

import java.util.Arrays;

/*
 * Problem Description
Given an integer array, A of size N.
You have to find all possible non-empty subsequences of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence. Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.


Example Input
Input 1:

A = [1, 2] 
Input 2:

A = [1]


Example Output
Output 1:

 1 
Output 2:

 0


Example Explanation
Explanation 1:

All possible non-empty subsets are:
[1]    largest-smallest = 1 - 1 = 0
[2]    largest-smallest = 2 - 2 = 0
[1 2]  largest-smallest = 2 - 1 = 1
Sum of the differences = 0 + 0 + 1 = 1
So, the resultant number is 1 
Explanation 2:

 Only 1 subsequence of 1 element is formed.

 */

public class SumTheDiff {
    public int solve(int[] A) {
        long sum=0;
        int N=A.length;
        long mod=1000000007;
        Arrays.sort(A);
        for(int i =0;i<N;i++){
            sum=(long)(sum+(A[i]*(Math.pow(2,i)%mod-Math.pow(2,N-i-1)%mod))%mod)%mod;
        }
        return (int)sum;
    }
}
