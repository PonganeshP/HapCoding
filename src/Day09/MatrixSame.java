package Day09;

import java.util.ArrayList;

public class MatrixSame {
    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int n=A.size();
        int m=A.get(0).size();
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A.get(i).get(j)!=B.get(i).get(j)){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            return 1;
        }
        return 0;
    }
}
