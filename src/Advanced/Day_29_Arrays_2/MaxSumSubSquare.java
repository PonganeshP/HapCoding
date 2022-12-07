package Advanced.Day_29_Arrays_2;

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
