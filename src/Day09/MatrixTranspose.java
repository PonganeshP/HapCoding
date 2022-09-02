package Day09;

import java.util.ArrayList;

public class MatrixTranspose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size()-1;
        int m=A.get(0).size()-1;
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=m;i++){
            res.add(new ArrayList<Integer>());
        }
        for(int j=0;j<=m;j++){
            for(int i=0;i<=n;i++){
                res.get(j).add(i,A.get(i).get(j));
            }
        }

        return res;
    }
}
