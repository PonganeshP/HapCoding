package Day11;

import java.util.ArrayList;

public class CountTriplets {
    public int solve(ArrayList<Integer> A) {
        int total=0;
        for(int j=0;j<A.size();j++){
            int counti=0;
            int countk=0;
            for(int i=j-1;i>=0;i--){
                if(A.get(i)<A.get(j)){
                    counti++;
                }
            }
            for(int k=j+1;k<A.size();k++){
                if(A.get(k)>A.get(j)){
                    countk++;
                }
            }
            total+=(counti*countk);
        }
        return total;
    }
}
