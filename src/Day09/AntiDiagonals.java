package Day09;

import java.util.ArrayList;

public class AntiDiagonals {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int N = 2 * n - 1;
  
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
     
        for(int i = 0; i < N; i++)
            result.add(new ArrayList<>());
        
            // 1 2 3 
            //4 will append to row 1 
            //5 
            //6 in place res[3]
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                result.get(i + j).add(A.get(i).get(j));

                //nice intuitive
        for(ArrayList<Integer> r:result){
            int s=A.size()-r.size();
            for(int i=0;i<s;i++){
                r.add(0);
            }
        }
        return result;   
    }
}
