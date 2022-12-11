package Advanced.Day_42_BinarySearch;

/*
 * Problem Description
Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
If not, return the index where it would be if it were inserted in order.

NOTE: You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.


Example Input
Input 1:

A = [1, 3, 5, 6]
B = 5 
Input 2:

A = [1]
B = 1


Example Output
Output 1:

2 
Output 2:

0


Example Explanation
Explanation 1:

The target value is present at index 2. 
Explanation 2:

The target value is present at index 0.

 */

public class FindIndex {
    public int searchInsert(int[] A, int B) {
        int l=0;int r=A.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(A[mid]>B){
                r=mid-1;
            }
            else if(A[mid]<B){
                l=mid+1;
            }
            else{
                return mid;
            }
        }
        if(l==r && A[l]==B){
            return l;
        }
        else if(l>=r){
            if((A[l]>B)){
                return l;
            }
            else{
                return l+1;
            }
        }
        return -1;
    }

}
