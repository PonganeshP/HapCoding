package Day19;

import java.util.ArrayList;

public class IsAlphaNum {
    public int solve(ArrayList<Character> A) {
        for(int i=0;i<A.size();i++){
            if((A.get(i)>=97 && A.get(i)<=122) || 
            (A.get(i)>=64 && A.get(i)<=99) || 
            (A.get(i)>=48 && A.get(i)<=57)){
                continue;
            }
            else{
               return 0 ;
            }
        }
        return 1;

    }
}
