package Advanced.Day_44_BinarySearch_3;

import java.util.Arrays;

/*
 * Challenges faced: Sort and then proceed with BS.
 * 
 */


 /*
  * Problem Description
Farmer John has built a new long barn with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?


Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively. So the minimum distance will be 2.
Explanation 2:

 The minimum distance will be 1.
  */

public class AggressiveCows {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int N=A.length;

        int l=Integer.MAX_VALUE;
        int r=A[N-1]-A[0];

        for(int i=N-1;i>0;i--){
            l=Math.min(A[i]-A[i-1],l);
        }

        while(l<=r){
            int mid=(l+r)/2;
            if(checkPossibility(A,mid,B)==true && ((mid==N-1)||checkPossibility(A,mid+1,B)==false)){
                return mid;
            }
            if(checkPossibility(A, mid, B)==false){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return B;
    }

    private boolean checkPossibility(int[] a, int mid, int b) {
        int count=1;
        int i=1;
        int j=0;
        while(i<=a.length-1){
            if((a[i]-a[j])>=mid){
                count++;
                j=i;
            }
            i++;
        }
        if(count>=b){
            return true;
        }
        return false;
    }
}