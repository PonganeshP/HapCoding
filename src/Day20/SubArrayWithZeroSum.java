package Day20;

import java.util.ArrayList;
import java.util.HashSet;

public class SubArrayWithZeroSum {
    public int solve(ArrayList<Integer> A) {
        HashSet<Long> hsa=new HashSet<>();
        hsa.add((long)0);
        long sum=0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(hsa.contains(sum)){
                return 1;
            }
            hsa.add((long)sum);
        }
        return 0;
    }
}
