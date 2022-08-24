package Day05;

import java.util.ArrayList;

public class ReverseRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        while(B<C){
            int temp=A.get(C);
            A.set(C,A.get(B));
            A.set(B,temp);
            B++;
            C--;
        }
        return A;
    }
}
