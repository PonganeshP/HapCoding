package Day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KOccurances {
    public int getSum(int A, int B, ArrayList<Integer> C) {
        long sum=0;
        boolean flag=true;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A;i++){
            if(!hm.containsKey(C.get(i))){
                hm.put(C.get(i), 0);
            }
            hm.computeIfPresent(C.get(i), (k,v)->v=v+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(B==entry.getValue()){
                flag=false;
                sum+=entry.getKey();
            }
        }
        if(flag){
            return -1;
        }
        return (int)(sum%1000000007);
    }
}
