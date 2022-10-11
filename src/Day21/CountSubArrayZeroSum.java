package Day21;

import java.util.ArrayList;
import java.util.HashMap;

public class CountSubArrayZeroSum {
    public int solve(ArrayList<Integer> A) {
        int res=0;
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, 1);
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(hm.containsKey(sum)){
                res += hm.get(sum);
                hm.put(sum, hm.get(sum) + 1);
            }
            else {
                hm.put(sum, 1);
              }
        }
        return res;
    }
}
