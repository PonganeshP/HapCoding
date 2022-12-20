package Advanced.Day_45_TwoPointers;
import java.util.Arrays;

/*
 * Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.


Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
 
 */

public class SubbArraySum {
    public int[] solve(int[] A, int B) {
        int i=0,j=0;
        int N=A.length;
        int sum=A[i];
        while(i<N && j<N){
            if(sum==B){
                return Arrays.copyOfRange(A, i, j+1);  
            }
            
            if(sum<B){
                j++;
                if(j<N)
                    sum+= A[j];
            }
                
            else{
                sum=sum-A[i];
                i++;
            }
        }
        return new int[]{-1};
    }
}
