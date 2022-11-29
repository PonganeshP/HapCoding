package Advanced.Day_29_Arrays_2;

/*
 * Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.

Example Input

Input 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
Input 2:

 A = [5, 17, 100, 11]
 B = 20


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 Now, all elements less than or equal to 8 are together.
Explanation 2:

 A = [5, 17, 100, 11]
 After swapping 100 and 11, A => [5, 17, 11, 100].
 Now, all elements less than or equal to 20 are together.
 
 */

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        int windowSize=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=B){
                windowSize++;
            }
        }
        int ans=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<windowSize;i++){
            if(A[i]>B){
                res++;
            }
        }
        ans=Math.min(ans,res);
        for(int i=1;i<=A.length-windowSize;i++){
            if(A[i-1]>B){
                res--;
            }
            if(A[i+windowSize-1]>B){
                res++;
            }
            ans=Math.min(ans,res);
        }
        return ans;
    }
}
