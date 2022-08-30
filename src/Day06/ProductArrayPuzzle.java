package Day06;

import java.util.ArrayList;

public class ProductArrayPuzzle {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int product=1;
        for(int i=0;i<A.size();i++){
            product*=A.get(i);
        }
        for(int i=0;i<A.size();i++){
            A.set(i,product/A.get(i));
        }
        return A;
    }
}
