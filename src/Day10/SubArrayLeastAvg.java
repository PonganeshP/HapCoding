package Day10;

import java.util.ArrayList;

public class SubArrayLeastAvg {
    public int solve(ArrayList<Integer> A, int B) {
        int sum=0;
        double min=0;
        double avg=0;
        int res=0;
        for(int i=0;i<B;i++){
            sum+=A.get(i);
        }
        avg=sum/(double)B;
        min=avg;
        res=0;
        int b=B;
        for(int i=1;i<=A.size()-B;i++){
            sum=sum+A.get(b)-A.get(i-1);
            avg=sum/(double)B;
            if(avg<=min){
                res=i;
                min=avg;
            }
            b++;
        }
        return res;
    }
}
