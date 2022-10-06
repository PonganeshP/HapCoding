package Day21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Diffk {
    public int diffPossible(final List<Integer> A, int B) {
        // HashSet hs=new HashSet<>();
        // for(int i=0;i<A.size();i++){
        //     int y=B+A.get(i);
        //     if(hs.contains(y)){
        //         return 1;
        //     }
        //     hs.add(A.get(i));
        //     hs.add(y);
        // }
        // return 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i),0);
            }
            hm.computeIfPresent(A.get(i), (k,v)->v=v+1);
        }
        for(int i=0;i<A.size();i++){
            int y=B+A.get(i);
            if(hm.containsKey(y)){
                if(hm.get(y)>1){
                    return 1;
                }
            }
        }
        return 0;
    }

}
