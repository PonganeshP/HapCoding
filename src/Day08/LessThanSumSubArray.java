package Day08;

import java.util.ArrayList;

public class LessThanSumSubArray {
    public int solve(ArrayList<Integer> A, int B) {
        int count=0;
        for(int i=0;i<A.size();i++){
            int sum=0;
            for(int j=i;j<A.size();j++){
                sum+=A.get(j);
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }
}
