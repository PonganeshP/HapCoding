package Day07;

import java.util.ArrayList;

public class LeaderArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int ans=0;
        ArrayList<Integer> resultArray=new ArrayList<Integer>();
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)>ans){
                ans=A.get(i);
                resultArray.add(A.get(i));
            }
        }
        return resultArray;
    }
}
