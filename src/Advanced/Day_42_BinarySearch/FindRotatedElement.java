package Advanced.Day_42_BinarySearch;

/*
 * Problem Description
Given a sorted array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index otherwise, return -1.

You may assume no duplicate exists in the array.

NOTE: Users are expected to solve this in O(log(N)) time.



Example Input
Input 1:

A = [4, 5, 6, 7, 0, 1, 2, 3]
B = 4 
Input 2:

A = [1]
B = 1


Example Output
Output 1:

 0 
Output 2:

 0


Example Explanation
Explanation 1:

 
Target 4 is found at index 0 in A. 
Explanation 2:

 
Target 1 is found at index 0 in A.
 */

public class FindRotatedElement {
    public int search(final int[] A, int B) {
        int l=0;
        int r=A.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(A[mid]==B) return mid;
            else if(A[mid]>A[l]){
                if(B>=A[l] && B<=A[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(B>=A[mid] && B<=A[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}
