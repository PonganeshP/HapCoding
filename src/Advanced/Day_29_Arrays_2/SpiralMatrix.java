package Advanced.Day_29_Arrays_2;

public class SpiralMatrix {
    public int[][] generateMatrix(int A) {
        int[][] res=new int[A][A];
        int l=A;
        int num=1;
        int i=0;
        int j=0;
        int N=A;
        while(N>1){
            for(int k=0;k<N-1;k++){
                res[i][j]=num;
                num++;
                j++;
            }
            for(int k=0;k<N-1;k++){
                res[i][j]=num;
                num++;
                i++;
            }
            for(int k=0;k<N-1;k++){
                res[i][j]=num;
                num++;
                j--;
            }
            for(int k=0;k<N-1;k++){
                res[i][j]=num;
                num++;
                i--;
            }
            N=N-2;
            i++;
            j++;
        }
        
        return res;
    }
}
