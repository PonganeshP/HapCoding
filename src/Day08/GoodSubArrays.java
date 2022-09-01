package Day08;

import java.util.ArrayList;

public class GoodSubArrays {
    public int solve(ArrayList<Integer> A, int B) {
        int count=0;
        for(int i=0;i<A.size();i++){
            int sum=0;
            for(int j=i;j<A.size();j++){
                sum+=A.get(j);
                if(sum<B && (i-j+1)%2==0){
                    count++;
                }
                if(sum>B && (i-j+1)%2!=0 ){
                    count++;
                }
            }
            
        }
        return count;
    }
}
