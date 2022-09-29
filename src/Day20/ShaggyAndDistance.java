package Day20;

import java.util.ArrayList;
import java.util.HashMap;

public class ShaggyAndDistance {
    public int solve(ArrayList<Integer> A) {
        int res=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hma=new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(!hma.containsKey(A.get(i))){
                hma.put(A.get(i), i);
            }
            else{
                int l=Math.abs(hma.get(A.get(i))-i);
                res=Math.min(res, l);
            }
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
}
