package Day06;

import java.util.ArrayList;

public class RangeSumPrefix {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> prefixArr=new ArrayList<Long>(10);
        ArrayList<Long> res=new ArrayList<>();
        long sum=0;
        for(int i=0;i<A.size();i++){
                prefixArr.add(i, sum+=A.get(i));
        }
        for(ArrayList<Integer> range:B){
            int start=range.get(0);
            int end=range.get(1);
            if(start==1){
                res.add(prefixArr.get(end-1));
            }
            else{
                res.add(prefixArr.get(end-1)-prefixArr.get(start-2));
            }
        }
        return res;
    }
}
