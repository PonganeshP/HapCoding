package Day08;

import java.util.ArrayList;

public class SubArrayRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=B;i<=C;i++){
            res.add(A.get(i));
        }
        return res;
    }
}
