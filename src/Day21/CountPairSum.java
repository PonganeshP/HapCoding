package Day21;

import java.util.ArrayList;
import java.util.HashMap;

public class CountPairSum {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res=0;
        // for(int i=0;i<A.size();i++){
        //     hm.put(A.get(i), hm.getOrDefault(A.get(i),0)+1);
        // }
        for(int i=0;i<A.size();i++){
            int k=B-A.get(i);
            if(hm.containsKey(k)){
                int value=hm.get(k)%1000000007;
                res+=value;
            }
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i))+1);
            }
            else{
                hm.put(A.get(i), 1);
            }
        }
        return (res)%1000000007;
    }
}
