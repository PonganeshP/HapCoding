package Day12;

import java.util.ArrayList;

public class SpecialIndex{
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> PSE=new ArrayList<Integer>();
        ArrayList<Integer> PSO=new ArrayList<Integer>();
        int evenSum=0;
        int oddSum=0;
        int count=0;
        for(int i=0;i<A.size();i++){
            if(i%2==0){
                evenSum+=A.get(i);
            }
            PSE.add(evenSum);
        }
        for(int i=0;i<A.size();i++){
            if(i%2!=0){
                oddSum+=A.get(i);
            }
            PSO.add(oddSum);
        }
        
        
        for(int i=0;i<A.size();i++){
            int sumOdd=0;
            int sumEven=0;
            if(i==0){
                sumOdd=(PSE.get(A.size()-1)-PSE.get(i));
                sumEven=(PSO.get(A.size()-1)-PSO.get(i));
                if(sumOdd==sumEven){
                    count++;
                }
            }
            else{
            sumOdd=PSO.get(i-1)+(PSE.get(A.size()-1)-PSE.get(i));
            sumEven=PSE.get(i-1)+(PSO.get(A.size()-1)-PSO.get(i));
            if(sumOdd==sumEven){
                count++;
            }
            }
        }
        return count;
    }
}