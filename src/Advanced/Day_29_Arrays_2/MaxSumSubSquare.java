package Advanced.Day_29_Arrays_2;

/*
 *Problem Description
Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.

Example Input
Input 1:

 A = [
        [1, 1, 1, 1, 1]
        [2, 2, 2, 2, 2]
        [3, 8, 6, 7, 3]
        [4, 4, 4, 4, 4]
        [5, 5, 5, 5, 5]
     ]
 B = 3
Input 2:

 A = [
        [2, 2]
        [2, 2]
    ]
 B = 2


Example Output
Output 1:

 48
Output 2:

 8


Example Explanation
Explanation 1:

    Maximum sum 3 x 3 matrix is
    8 6 7
    4 4 4
    5 5 5
    Sum = 48
Explanation 2:

 Maximum sum 2 x 2 matrix is
  2 2
  2 2
  Sum = 8 
 */

public class MaxSumSubSquare {
    public int solve(int[][] A, int B) {
        int N=A.length;
        int M=A[0].length;
        int[][] PS=new int[N][M];
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
        int max=PS[B-1][B-1];

        for(int i=B;i<N;i++){
            int sum=PS[i][B-1]-PS[i-B][B-1];
            max=Math.max(max,sum);
        }
        for(int j=B;j<M;j++){
            int sum=PS[B-1][j]-PS[B-1][j-B];
            max=Math.max(max,sum);
        }

        for(int i=B;i<N;i++){
            for(int j=B;j<M;j++){
                int sum=PS[i][j]-PS[i][j-B]-PS[i-B][j]+PS[i-B][j-B];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}
