package Day06;

import java.util.ArrayList;

public class EquillibriumArray {
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> PA=prefixArray(A);
        for(int i=0;i<A.size();i++){
            int ls=0;
            int le=i-1;
            int rs=i+1;
            int re=A.size()-1;
            int left=0;
            int right=0;
            if(i==0){
                left=0;
                if(rs==0){
                    right=PA.get(re);
                }
                else{
                    right=PA.get(re)-PA.get(rs-1);
                }
            }
            else if(i==A.size()-1){
                right=0;
                if(ls==0){
                    left=PA.get(le);
                }
                else{
                    left=PA.get(le)-PA.get(le-1);
                }
            }
            else{
                if(ls==0){
                    left=PA.get(le);
                    right=PA.get(re)-PA.get(rs-1);
                }
                else if(rs==0){
                    right=PA.get(re);
                    left=PA.get(le)-PA.get(le-1);
                }
                else{
                    left=PA.get(le)-PA.get(le-1);
                    right=PA.get(re)-PA.get(rs-1);
                }
            }
            if(left==right){
                return i;
            }
        }
        return -1;
        
    }
    public ArrayList<Integer> prefixArray(ArrayList<Integer> A) {
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            A.set(i,sum);
        }
        return A;
    }
}
