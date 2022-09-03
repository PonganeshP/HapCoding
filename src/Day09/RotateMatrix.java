package Day09;

import java.util.ArrayList;

public class RotateMatrix {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size()-1;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int temp=A.get(i).get(j);
                A.get(i).set(j,A.get(j).get(i));
                A.get(j).set(i,temp);
            }
        }
        for(int i=0;i<=n;i++){
            int j1=0;
            int j2=A.size()-1;
            while(j1<=j2){
                int temp=A.get(i).get(j1);
                A.get(i).set(j1,A.get(i).get(j2));
                A.get(i).set(j2,temp);
                j1++;
                j2--;
            }
        }
        for(ArrayList<Integer> a:A){
            System.out.println(a);
        }
    }
}
