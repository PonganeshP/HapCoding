package Advanced.Day_43_BinarySearch_2;

/*
 * 
 * Problem Description
Given an array of integers A and an integer B, find and return the maximum value K such that there is no subarray in A of size K with the sum of elements greater than B.


Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 10
Input 2:

A = [5, 17, 100, 11]
B = 130


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

Constraints are satisfied for maximal value of 2.
Explanation 2:

Constraints are satisfied for maximal value of 3.
 */

public class SpecialInteger {
    public int solve(int[] A, int B) {
        int l=1;
        int r=A.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(checkPossibility(mid,A,B)==false &&((mid==A.length-1) || checkPossibility(mid+1,A,B)==true)){
                return mid;
            }
            if(checkPossibility(mid,A,B)==false){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return 0;
    }
    public boolean checkPossibility(int windowSize,int[] arr,int B){
        long sum=0;
        for(int i=0;i<windowSize;i++){
            sum+=arr[i];
        }
        if(sum>B){
            return true;
        }
        for(int i=1;i<=arr.length-windowSize;i++){
            sum-=arr[i-1];
            sum+=arr[windowSize+i-1];
            if(sum>B){
                return true;
            }
        }
        return false;
    }
}
