package Day09;

import java.util.ArrayList;
import java.util.List;

public class MainDiagonalSum {
    public int solve(final List<ArrayList<Integer>> A) {
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i).get(i);
        }
        return sum;
    }
}
