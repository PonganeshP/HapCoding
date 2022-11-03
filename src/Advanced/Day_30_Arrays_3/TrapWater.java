package Advanced.Day_30_Arrays_3;

/*
 * Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it is able to trap after raining.

Example Input
Input 1:

A = [0, 1, 0, 2]

Example Output
Output 1:

1

 */

public class TrapWater {
    public int trap(final int[] A) {
        int[] leftMax=new int[A.length];
        int[] rightMax=new int[A.length];
        int n=A.length;
        leftMax[0]=0;
        rightMax[n-1]=0;
        int right=A[n-1];
        int left=A[0];
        for(int i=n-2;i>=0;i--){
            if(A[i]>right){
                right=0;
            }
            rightMax[i]=right;
            if(A[i]>right){
                right=A[i];
            }
        }
        for(int i=1;i<=n-1;i++){
            if(A[i]>left){
                left=0;
            }
            leftMax[i]=left;
            if(A[i]>left){
                left=A[i];
            }
        }
        int total=0;
        for(int i=0;i<n;i++){
            int sum=Math.min(leftMax[i],rightMax[i])-A[i];
            if(sum>0)
                total+=sum;

        }
        return total;
    }
}
