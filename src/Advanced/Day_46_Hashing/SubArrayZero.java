package Advanced.Day_46_Hashing;

import java.util.HashSet;

public class SubArrayZero {
    public int solve(int[] A) {
        long sum=0;
        HashSet<Long> set = new HashSet<Long>();
        for(long i=0;i<A.length;i++){
            sum=(long)(sum+A[(int) i]);
            if(set.contains(sum) || sum==0){
                return 1;
            }
            set.add(sum);
        }
        return 0;
    }
}
