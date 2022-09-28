package Day20;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElements {
    public int solve(ArrayList<Integer> A) {
        int res=-1;
        HashMap<Integer,Integer> hma=new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(!hma.containsKey(A.get(i))){
                hma.put(A.get(i),0);
            }
            hma.computeIfPresent(A.get(i), (k,v)-> v+1);
        }
        for(int i=0;i<A.size();i++){
            int key=A.get(i);
            if(hma.get(key)>1){
                return key;
            }
        }    
    return res;
    }
}
