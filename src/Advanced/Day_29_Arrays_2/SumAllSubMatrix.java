package Advanced.Day_29_Arrays_2;

/*
 * Problem Description
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.

Example Input
A = [ [1, 1]
      [1, 1] ]

Example Output
16


Example Explanation
Number of submatrices with 1 elements = 4, so sum of all such submatrices = 4 * 1 = 4
Number of submatrices with 2 elements = 4, so sum of all such submatrices = 4 * 2 = 8
Number of submatrices with 3 elements = 0
Number of submatrices with 4 elements = 1, so sum of such submatrix = 4
Total Sum = 4+8+4 = 16

 * 
 */

public class SumAllSubMatrix {
    public int solve(int[][] A) {
        int sum=0;
        int N=A.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int count=(i+1)*(j+1)*(N-i)*(N-j);
                int contri=count*A[i][j];
                sum+=contri;
            }
        }
        return sum;
    }
}
