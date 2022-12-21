package Advanced.Day_46_Hashing;

import java.util.Arrays;

/*
    Using two pointers + Sorting
    TC: O(NlogN)
    SC: O(1)

*/ 

/*
 * 
 *Problem Description
Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from array A.



Example Input
Input 1:

A = [100, 4, 200, 1, 3, 2]
Input 2:

A = [2, 1]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].
Explanation 2:

 The set of consecutive elements will be [1, 2].
 
 */


public class LongestConsecutive {
    public int longestConsecutive(final int[] A) {
        if(A.length==1){
            return 1;
        }
        Arrays.sort(A);
        int i=0;
        int j=1;
        int res=Integer.MIN_VALUE;
        int temp=0;
        while(i<A.length && j<A.length){
            if((A[j]-A[i])==1){
                temp++;
            }
            else if(A[i]==A[j]){
                temp=temp;
            }
            else{
                temp=0;
            }
            res=Math.max(temp,res);
            i++;
            j++;
        }
        return res+1;
    }
}
