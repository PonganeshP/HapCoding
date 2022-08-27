package Day06;

import java.util.ArrayList;

public class EvenNumberRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> PA=count(A);
        ArrayList<Integer> res=new ArrayList<>();
        for(ArrayList<Integer> b:B){
            int s=b.get(0);
            int e=b.get(1);
            if(s==0){
                res.add(PA.get(e));
            }
            else{
                res.add(PA.get(e)-PA.get(s-1));
            }
        }
        return res;
    }
    public ArrayList<Integer> count(ArrayList<Integer> A) {
        int count=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)%2==0){
                count++;
                A.set(i,count);
            }
            A.set(i,count);
        }
        return A;
        }
}
