package Day11;

import java.util.ArrayList;

public class MaximumPositivity {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int min_start_index=Integer.MAX_VALUE;
        int start_index=0;
        int end_index=0;
        ArrayList<Integer> res=new ArrayList<>();
        int finalCount=0;
        int count=0;
        boolean flag=true;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                if(count>finalCount){
                    min_start_index=start_index;
                    end_index=i-1;
                }
                finalCount=Math.max(count,finalCount);
                count=0;
                flag=true;
            }
            else{
                count++;
                if(count>finalCount){
                    min_start_index=start_index;
                }
                if(flag){
                    flag=false;
                    start_index=i;
                }
            }
        }
        if(min_start_index>end_index){
            end_index=A.size()-1;
        }
        for(int i=min_start_index;i<=end_index;i++){
            res.add(A.get(i));
        }
        return res;
    }
}
