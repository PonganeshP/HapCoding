package Day17;

import java.util.ArrayList;
import java.util.Collections;

public class ElementRemovalCost {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> PS=new ArrayList<>();
        int sum=0;
        int cost=0;
        Collections.sort(A,Collections.reverseOrder());
        for(int i=A.size()-1;i>=0;i--){
            sum+=A.get(i);
            PS.add(sum);
        }
        for(int i=0;i<PS.size();i++){
            cost+=PS.get(i);
        }
        return cost;
    }
}
