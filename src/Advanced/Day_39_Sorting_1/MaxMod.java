package Advanced.Day_39_Sorting_1;

/*
 * Problem Description
Given an array A of size N, Groot wants you to pick 2 indices i and j such that

1 <= i, j <= N
A[i] % A[j] is maximum among all possible pairs of (i, j).
Help Groot in finding the maximum value of A[i] % A[j] for some i, j.


Example Input
Input 1:

 A = [1, 2, 44, 3]
Input 2:

 A = [2, 6, 4]


Example Output
Output 1:

 3
Output 2:

 4


Example Explanation
Explanation 1:

 For i = 3, j = 2  A[i] % A[j] = 3 % 44 = 3.
 No pair exists which has more value than 3.
Explanation 2:

 For i = 2, j = 1  A[i] % A[j] = 4 % 6 = 4.
 */

public class MaxMod {
    public int solve(int[] A) {
        boolean flag=true;
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[i-1]){
                flag=false;
                break;
            }
        }
        if(flag){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]!=max)
                res=Math.max(res,A[i]);
        }
        return res;
    }
}
