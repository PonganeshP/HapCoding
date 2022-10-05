package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        long sum=0;
        int start=0;
        int end=-1;
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Long,Integer> hm=new HashMap<>();
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(sum-B==0){
                start=0;
                end=i;
                break;
            }
            if(hm.containsKey(sum-B)){
                start=hm.get(sum-B)+1;
                end=i;
                break;
            }
            hm.put(sum, i);
        }
        if(end==-1){
            return new ArrayList<>(Arrays.asList(-1));
        }
        for(int i=start;i<=end;i++){
            res.add(A.get(i));
        }
        return res;
        
    }
}
