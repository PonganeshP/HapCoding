package Day21;

import java.util.ArrayList;
import java.util.HashMap;

public class CountPairDiff {
    public int solve(ArrayList<Integer> A, int B) {
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.size();i++){
            int k1=A.get(i)+B;
            int k2=A.get(i)-B;
            if(hm.containsKey(k1)){
                int value=hm.get(k1)%1000000007;
                res+=value;
            }
            if(hm.containsKey(k2)){
                int value=hm.get(k2)%1000000007;
                res+=value;
            }
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i))+1);
            }
            else{
                hm.put(A.get(i), 1);
            }
        }
        return res%1000000007;
    }
}
