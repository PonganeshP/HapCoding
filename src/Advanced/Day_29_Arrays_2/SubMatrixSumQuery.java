package Advanced.Day_29_Arrays_2;

/*
 * Problem Description
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
Sum may be large, so return the answer mod 109 + 7.

Example Input
Input 1:

 A = [   [1, 2, 3]
         [4, 5, 6]
         [7, 8, 9]   ]
 B = [1, 2]
 C = [1, 2]
 D = [2, 3]
 E = [2, 3]

 Example Output
Output 1:

 [12, 28]
 */

public class SubMatrixSumQuery {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int N=A.length;
        int M=A[0].length;
        long[][] PS=new long[N][M];
        int[] ans=new int[B.length];
        PS[0][0]=A[0][0];
        for(int i=1;i<N;i++){
            PS[i][0]=PS[i-1][0]+A[i][0];
        }
        for(int j=1;j<M;j++){
            PS[0][j]=PS[0][j-1]+A[0][j];
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<M;j++){
                PS[i][j]=PS[i-1][j]+PS[i][j-1]-PS[i-1][j-1]+A[i][j];
            }
        }
        for(int i=0;i<B.length;i++){
            int r1=B[i]-1;
            int c1=C[i]-1;
            int r2=D[i]-1;
            int c2=E[i]-1;
            long sum=0;
            if(r1>0)
                sum-=PS[r1-1][c2];
            if(c1>0)
                sum-=PS[r2][c1-1];
            if(r1>0 && c1>0)
                sum+=PS[r1-1][c1-1];
            sum+=PS[r2][c2];
            int mod=1000000007;
            sum=(sum%mod+mod)%mod;
            ans[i]=(int)sum;
        }
        return ans;

    }
}
