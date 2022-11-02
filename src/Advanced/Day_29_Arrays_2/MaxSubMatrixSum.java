package Advanced.Day_29_Arrays_2;

public class MaxSubMatrixSum {
    public long solve(int[][] A) {
        int N=A.length;
        int M=A[0].length;
        long res=Integer.MIN_VALUE;
        long[][] SS=new long[N][M];
        SS[N-1][M-1]=A[N-1][M-1];
        res=Math.max(SS[N-1][M-1],res);
        for(int i=N-2;i>=0;i--){
            SS[i][M-1]=SS[i+1][M-1]+A[i][M-1];
            res=Math.max(SS[i][M-1],res);
        }
        for(int j =M-2;j>=0;j--){
            SS[N-1][j]=SS[N-1][j+1]+A[N-1][j];
            res=Math.max(SS[N-1][j],res);
        }
        for(int i=N-2;i>=0;i--){
            for(int j=M-2;j>=0;j--){
                SS[i][j]=SS[i+1][j]+SS[i][j+1]-SS[i+1][j+1]+A[i][j];
                res=Math.max(SS[i][j],res);
            }
        }
        return res;
    }
}
