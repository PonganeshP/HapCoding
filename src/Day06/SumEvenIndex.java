package Day06;

import java.util.ArrayList;

public class SumEvenIndex {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> PA=evenPrefix(A);
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(ArrayList<Integer> b:B){
            int end=b.get(1);
            int start=b.get(0);
            if(start==0){
                res.add(PA.get(end));
            }
            else{
                res.add(PA.get(end)-PA.get(start-1));
            }
        }
        return res;
    }
    public ArrayList<Integer> evenPrefix(ArrayList<Integer> A){
        int sum=0;
        for(int i=0;i<A.size();i++){
            if(i%2==0 || i==0){
                sum+=A.get(i);
                A.set(i,sum);
            }
            else{
                A.set(i,sum);
            }
        }
        return A;
    }
}
