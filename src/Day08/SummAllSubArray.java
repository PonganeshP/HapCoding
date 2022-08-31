package Day08;

import java.util.ArrayList;

public class SummAllSubArray {
    public Long subarraySum(ArrayList<Integer> A) {
        long sum=0;
        for(long i=0;i<A.size();i++){
            long count=(i+1)*(A.size()-i);
            long contr=count*A.get((int)i);
            sum+=contr;
        }
        return sum;
    }
}
