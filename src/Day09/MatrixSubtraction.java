package Day09;

import java.util.ArrayList;

public class MatrixSubtraction {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int n=A.size();
        int m=A.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A.get(i).set(j,A.get(i).get(j)-B.get(i).get(j));
            }
        }
        return A;
    }
}
