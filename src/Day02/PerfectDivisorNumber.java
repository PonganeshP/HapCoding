package Day02;

public class PerfectDivisorNumber {
    public int solve(int A) {
        int sum=0;
        for(int i=1;i<=A/2;i++){
            if(A%i==0){
                sum+=i;
            }
        }
        if(sum==A && A!=1){
            return 1;
        }
        return 0;
    }
}
