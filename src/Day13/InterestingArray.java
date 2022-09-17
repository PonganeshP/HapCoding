package Day13;

import java.util.ArrayList;

public class InterestingArray {
    public String solve(ArrayList<Integer> A) {
        int countOdd=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)%2!=0){
                countOdd++;
            }
        }
        if(countOdd%2==0){
            return "Yes";
        }
        return "No";
    }
}
