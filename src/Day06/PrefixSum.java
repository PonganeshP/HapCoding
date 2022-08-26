package Day06;

import java.util.ArrayList;

public class PrefixSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            A.set(i,sum);
        }
        return A;
    }
}
