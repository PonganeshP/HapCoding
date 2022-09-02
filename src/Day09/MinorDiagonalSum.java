package Day09;

import java.util.ArrayList;
import java.util.List;

public class MinorDiagonalSum{
    public int solve(final List<ArrayList<Integer>> A) {
        int n=A.size()-1;
        int sum=0;
        int i=0;
        int j=n;
        while(j>=0){
            sum+=A.get(i).get(j);
            i++;
            j--;
        }
        return sum;
    }
}