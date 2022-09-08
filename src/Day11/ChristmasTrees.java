package Day11;

import java.util.ArrayList;

public class ChristmasTrees{
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int ans=Integer.MAX_VALUE;
        for(int j=1;j<A.size()-1;j++){
            int res=Integer.MAX_VALUE;
            int min_k=Integer.MAX_VALUE;
            int min_i=Integer.MAX_VALUE;
            for(int i=j-1;i>=0;i--){
                if(A.get(i)<A.get(j)){
                    min_i=Math.min(min_i,B.get(i));
                }
            }
            for(int k=j+1;k<A.size();k++){
                if(A.get(k)>A.get(j)){
                    min_k=Math.min(min_k,B.get(k));
                }
            }
        
            res=min_i+B.get(j)+min_k;
            ans=Math.min(res,ans);
        }
        return ans;
    }
}