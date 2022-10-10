package Day21;

import java.util.ArrayList;
import java.util.HashMap;

public class PairXOR {
    public int solve(ArrayList<Integer> A, int B) {
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.size();i++){
            int a=A.get(i);
            int b=B^a;
            if(hm.containsKey(b)){
                res+=hm.get(b);
            }
            if(hm.containsKey(a)){
                hm.put(a, hm.get(a)+1);
            }
            else{
                hm.put(a, 1);
            }
        }
        return res;
    }
}
