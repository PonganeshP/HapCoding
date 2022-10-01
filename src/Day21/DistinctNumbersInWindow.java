package Day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DistinctNumbersInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<B;i++){
            if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i),0);
            }
            hm.computeIfPresent(A.get(i), (k,v)->v=v+1);
        }
        res.add(hm.size());
        int W=B;
        for(int i=1;i<=A.size()-W;i++){
            if(!hm.containsKey(A.get(B))){
                hm.put(A.get(B),1);
            }
            else{
                hm.computeIfPresent(A.get(B),  (k,v)->v=v+1);
            }
            int i1=i-1;
            hm.computeIfPresent(A.get(i1), (k,v)->v=v-1);
            if(hm.get(A.get(i1))==0){
                hm.remove(A.get(i1));
            }
            B++;
            res.add(hm.size());
        }
        return res;
    }

}
