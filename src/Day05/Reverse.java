package Day05;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public ArrayList<Integer> solve(final List<Integer> A) {
        // int i=0;
        // int j=A.size()-1;
        // while(i<j){
        //     int temp=A.get(j);
        //     A.set(j,A.get(i));
        //     A.set(i,temp);
        //     i++;
        //     j--;
        // }

        var res=new ArrayList<Integer>();
        for(int i=A.size()-1,j=0;i>=0;i--,j++){
            res.add(j, A.get(i));
        }
        return res;
        
    }
}
