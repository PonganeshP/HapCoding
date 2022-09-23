package Contest;

import java.util.ArrayList;

public class Q3 {
    public ArrayList<Integer> solve(String A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> PS=new ArrayList<>();
        int count=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u'){
                count++;
            }
            PS.add(i,count);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<B.size();i++){
            int start=B.get(i).get(0);
            int end = B.get(i).get(1);
            if(start==0){
                res.add(PS.get(end));
            }
            else{
                res.add(PS.get(end)-PS.get(start-1));
            }
        }
        return res;
    }
}
