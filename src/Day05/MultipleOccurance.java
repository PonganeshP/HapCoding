package Day05;

import java.util.ArrayList;

public class MultipleOccurance {
    public class Solution {
        public int solve(ArrayList<Integer> A, int B) {
            int count=0;
            for(int i=0;i<A.size();i++){
                if(A.get(i)==B){
                    count++;
                }
            }
            return count;
        }
    }
    
}
