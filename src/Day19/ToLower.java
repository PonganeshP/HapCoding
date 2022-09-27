package Day19;

import java.util.ArrayList;

public class ToLower {
    public ArrayList<Character> to_lower(ArrayList<Character> A) {
        for(int i=0;i<A.size();i++){
            if(A.get(i)>=65 && A.get(i)<=90){
                A.set(i, (char) (A.get(i)+32));
            }
        }
        return A;
        
    }
}
