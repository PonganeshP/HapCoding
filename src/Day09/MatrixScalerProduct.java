package Day09;

import java.util.ArrayList;

public class MatrixScalerProduct {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n=A.size();
        int m=A.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A.get(i).set(j,A.get(i).get(j)*B);
            }
        }
        return A;
    }
}

