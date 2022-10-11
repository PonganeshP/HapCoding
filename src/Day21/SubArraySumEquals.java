package Day21;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySumEquals {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0,1);
        int result = 0;
        int cSum = 0;
 
        for (int i = 0; i < A.size(); i++) {
            cSum += A.get(i);
            int removeSum=cSum-B;
            if (prevSum.containsKey(removeSum))
                result += prevSum.get(removeSum);
            prevSum.put(cSum,prevSum.getOrDefault(cSum,0)+1);
        }
 
        return result;
    }
}
