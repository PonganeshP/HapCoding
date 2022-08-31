package Day08;

import java.util.ArrayList;

public class MaxSubArray {
    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        int max=0;
        for(int i=0;i<A;i++){
            int sum=0;
            for(int j=i;j<A;j++){
                sum+=C.get(j);
                if(sum>=max && sum<=B){
                max=sum;
            }
            }
        }
        return max;
    }
}
