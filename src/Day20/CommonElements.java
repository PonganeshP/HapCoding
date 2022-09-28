package Day20;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hma=new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(!hma.containsKey(A.get(i))){
                hma.put(A.get(i),0);
            }
            hma.computeIfPresent(A.get(i), (k,v)-> v+1);
        }
        for(int i=0;i<B.size();i++){
            if(hma.containsKey(B.get(i))){
                if(hma.get(B.get(i))>0){
                    Integer val=hma.get(B.get(i))-1;
                    hma.put(B.get(i),val);
                    res.add(B.get(i));
                }
            }
        }
        return res;
        
    }
}
