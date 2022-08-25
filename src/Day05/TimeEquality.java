package Day05;

import java.util.ArrayList;

public class TimeEquality {
    public int solve(ArrayList<Integer> A) {
        int max=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i) > max || i==0){
                max=A.get(i);
            }
        }
        int time=0;
        for(int i=0;i<A.size();i++){
            time+=(max-A.get(i));
        }
        return time;
    }
}
