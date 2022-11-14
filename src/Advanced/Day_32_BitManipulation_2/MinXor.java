package Advanced.Day_32_BitManipulation_2;

import java.util.Arrays;

public class MinXor {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int ans=Integer.MAX_VALUE;
        int tot=0;
        for(int i=0;i<A.length-1;i++){
            tot=A[i]^A[i+1];
            ans=Math.min(ans,tot);
        }
        return ans;
    }
}
