package Day05;

import java.util.ArrayList;

public class GreaterThanItself {
    public int solve(ArrayList<Integer> A) {
        int max=0;
        int count=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max){
                max=A.get(i);
                count=i;
            }
            else if(A.get(i)!=max){
                count++;
            }
        }
        // for (int i = 0; i < A.size(); i++) {
        //     if(max==A.get(i)){
        //         count++;
        //     }
        // }
        return count;
    }
}
