package Day10;

import java.util.ArrayList;

public class SlidingWindow1 {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int sum=0;
        for(int i=0;i<=B-1;i++){
            sum+=A.get(i);
        }
        if(sum==C){
            return 1;
        }
        int i=1;
        while(B<=A.size()-1){
            sum=sum-A.get(i-1)+A.get(B);
            if(sum==C){
                return 1;
            }
            B++;
            i++;
        }
        return 0;
    }
}
