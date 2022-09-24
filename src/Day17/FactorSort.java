package Day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class FactorSort {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int fa=factors(a);
                int fb=factors(b);
                if(fa==fb){
                    return a-b;
                }
                return fa-fb;
            }
        });
        
        return A;
        
    }
        public int factors(int N){
            int count=0;
            for(int i=1;i*i<=N;i++){
                if(N%i==0){
                    if(i==N/i){
                        count++;
                    }
                    else{
                        count+=2;
                    }
                }
            }
            return count;
    }
}
