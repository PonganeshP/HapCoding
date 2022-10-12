package Day21;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public int solve(ArrayList<Integer> A) {
        HashMap<Long,Integer> hm=new HashMap<>();
        long currSum=0;
        int start=0;
        int end=-1;
        hm.put(0L, -1);
        int max_len=0;
        for(int i=0;i<A.size();i++){
            currSum+=A.get(i);
            if(hm.containsKey(currSum)){
                int l=hm.get(currSum)+1;
                int r=i;
                int len=r-l+1;
                max_len=Math.max(max_len,len);
            }
            else{
                hm.put(currSum, i);
            }
        }
       return max_len;
    }
}
