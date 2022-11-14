package Advanced.Day_33_Modular_Arithmatic;
/*
 * 
 *  A, B and Modulo 
 * 
Problem Description
Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
 
Example Input
Input 1:

A = 1
B = 2
Input 2:

A = 5
B = 10

Example Output
Output 1:

1
Output 2:

5

Example Explanation
Explanation 1:

1 is the largest value of M such that A % M == B % M.
Explanation 2:

For M = 5, A % M = 0 and B % M = 0.

No value greater than M = 5, satisfies the condition.

*/


//Largest value of M
public class GCD {
    public int solve(int A, int B) {
        int max=Math.max(A,B);
        int min=Math.min(A,B);
        return max-min;
    }
}
