package Day17;

import java.util.ArrayList;
import java.util.Collections;

public class CheckAP {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int diff=A.get(1)-A.get(0);
        for(int i=1;i<A.size();i++){
            if(i+1<A.size() && (A.get(i+1)-A.get(i))!=diff){
                return 0;
            }
        }
        return 1;
    }
}
