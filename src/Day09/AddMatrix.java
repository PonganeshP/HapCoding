package Day09;

import java.util.ArrayList;

public class AddMatrix {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        int n=A.size();
        int m=A.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum=A.get(i).get(j)+B.get(i).get(j);
                A.get(i).set(j,sum);
            }
        }
        return A;
    }
}
