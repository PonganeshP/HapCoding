package Advanced.Day_42_BinarySearch;

/*
 * Problem Description
Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time. The array may have duplicate elements.


Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

 5
Output 2:

 100


Example Explanation
Explanation 1:

 5 is the peak.
Explanation 2:

 100 is the peak.
 */

public class FindPeak {
    public int solve(int[] A) {
        int N=A.length-1;
        if(N==0){
            return A[0];
        }
        int l=0;int r=A.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if((mid==0 || mid==N || ((A[mid-1]<A[mid])) && (A[mid+1]<A[mid]))){
                if(mid==0 && A[mid]>A[mid+1]){
                    return A[mid];
                }
                if(mid==N && A[mid]>A[mid-1]){
                    return A[mid];
                }
            }
            
                if(A[mid+1]>A[mid]){
                    l=mid+1;
                }
                else if(A[mid-1]>A[mid]){
                    r=mid-1;
                }
                else{
                    return A[mid];
                }
            
        }
        return -1;

    }
}
