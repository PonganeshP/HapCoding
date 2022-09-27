package Day19;

import java.util.ArrayList;

public class ToUpper {
    public ArrayList<Character> to_upper(ArrayList<Character> A) {
        for(int i=0;i<A.size();i++){
            if(A.get(i)>=97 && A.get(i)<=122){
                A.set(i, (char) (A.get(i)-32));
            }
        }
        return A;
    }
}
