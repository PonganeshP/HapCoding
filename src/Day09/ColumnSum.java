package Day09;

import java.util.ArrayList;

public class ColumnSum {
    
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size()-1;
        int m=A.get(0).size()-1;
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<=m;i++){
            int sum=0;
            for(int j=0;j<=n;j++){
                sum+=A.get(j).get(i);
            }
            res.add(sum);
        }
        return res;
    }
}
