package Day05;

import java.util.ArrayList;

public class RangeSumQuery {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(ArrayList<Integer> arr:B){
            int sum=0;
            for(int i=arr.get(0);i<=arr.get(arr.size()-1);i++){
                sum+=A.get(i-1);
            }
            res.add(sum);
        }
    return res;
    }
}
