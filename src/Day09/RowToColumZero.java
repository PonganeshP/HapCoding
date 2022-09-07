package Day09;

import java.util.ArrayList;

public class RowToColumZero {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n=A.size();
        int m=A.get(0).size();
        ArrayList<Integer> zeroOccurRow=new ArrayList<>();
        ArrayList<Integer> zeroOccurColumn=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A.get(i).get(j)==0){
                    zeroOccurRow.add(i);
                    zeroOccurColumn.add(j);
                }
            }
        }
        for(Integer z:zeroOccurRow){
            for(int j=0;j<m;j++){
                A.get(z).set(j,0);
            }
        }
        for(Integer z2:zeroOccurColumn){
            for(int i=0;i<n;i++){
                A.get(i).set(z2,0);
            }
        }
        return A;
    }
}
