package Day14;

public class FindingGoodDays {
    public int solve(int A) {
        if(A==0){
            return 0;
        }
        int ans=0;
        while(A>0){
            if((A&1)==1){
                ans++;
            }
            A=A>>1;
        }
        return ans;
    }
}
