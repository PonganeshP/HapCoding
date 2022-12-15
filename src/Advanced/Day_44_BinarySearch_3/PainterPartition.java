package Advanced.Day_44_BinarySearch_3;

/*
 * Problem Description
Given 2 integers A and B and an array of integers C of size N. Element C[i] represents the length of ith board.
You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of the board.

Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.
NOTE:
1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.

Return the ans % 10000003.


Example Input
Input 1:

 A = 2
 B = 5
 C = [1, 10]
Input 2:

 A = 10
 B = 1
 C = [1, 8, 11, 3]


Example Output
Output 1:

 50
Output 2:

 11


Example Explanation
Explanation 1:

 Possibility 1:- One painter paints both blocks, time taken = 55 units.
 Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
 There are no other distinct ways to paint boards.
 ans = 50 % 10000003
Explanation 2:

 Each block is painted by a painter so, Painter 1 paints block 1, painter 2 paints block 2, painter 3 paints block 3 
 and painter 4 paints block 4, time taken = max(1, 8, 11, 3) = 11
 ans = 11 % 10000003
 
 */

public class PainterPartition {
    public int paint(int A, int B, int[] C) {
        if(A==1){
            long sum=0;
            for(int i=0;i<C.length;i++){
                sum+=C[i];
            }
            return (int)((sum*B)%10000003);
        }
        long l=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<C.length;i++){
            sum+=C[i];
            l=Math.max(l,C[i]*B);
        }
        long r=sum*B;
        while(l<=r){
            long mid=(l+r)/2;
            if((checkPossibility(mid,A,C,B)==true) && ((mid==l)||checkPossibility(mid-1,A,C,B)==false)){
                return (int)((mid)%10000003);
            }
            if(checkPossibility(mid,A,C,B)==false){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public boolean checkPossibility(long m, int p,int[] arr,int T){
        int givenPainter=p;
        long totalTimeGiven=m;
        int count=1;
        for(int i =0;i<arr.length;i++){
            if((arr[i]*T) <= totalTimeGiven){
                totalTimeGiven-=(arr[i]*T);
            }
            else{
                count++;
                totalTimeGiven=m-(arr[i]*T);
            }
        }
        if(count<=givenPainter){
            return true;
        }
        return false;
    }
}
