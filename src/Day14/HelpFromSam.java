package Day14;

public class HelpFromSam {
    public int solve(int A) {
        if(A==0){
            return 0;
        }
        if(A==1){
            return 1;
        }
        int ans=0;
        while(A>0){
            if((A&1)==1){
                ans+=1;
            }
            A=A>>1;
        }
        return ans;
    }
}
