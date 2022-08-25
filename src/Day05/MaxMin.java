package Day05;

import java.util.ArrayList;

public class MaxMin {
    public int solve(ArrayList<Integer> A) {
        int max=0, min=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max || i==0){
                max=A.get(i);
            }
            if(A.get(i)<min || i==0){
                min=A.get(i);
            }
        }
        return max+min;
    }
}
