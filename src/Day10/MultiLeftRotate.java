package Day10;

import java.util.ArrayList;

public class MultiLeftRotate {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int N=A.size();
        for(Integer r:B){
            while(r>N){
                r=r-N;
            }
            var rev1=Reverse(A,0,N-1);
            var rev2=Reverse(rev1,0,N-1-r);
            res.add(Reverse(rev2,N-r,N-1));
        }
        return res;
    }
    public ArrayList<Integer> Reverse(ArrayList<Integer> arr,int a,int b){
        int i=a;
        int j=b;
        // ArrayList<Integer> arr=new ArrayList<>();
        // arr=(ArrayList<Integer>) A.clone();
        
        ArrayList<Integer> A2=(ArrayList<Integer>) arr.clone();
        while(i<j){
            int temp=A2.get(i);
            A2.set(i,A2.get(j));
            A2.set(j,temp);
            i++;
            j--;
        }
        return A2;
    }
}
