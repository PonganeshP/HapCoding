package Advanced.Day_33_Modular_Arithmatic;

public class PairSumDivisible {
    public int solve(int[] A, int B) {
        int n=A.length;
        long mod=1000000007;
        long[] countArr=new long[B];
        for(int i=0;i<n;i++){
            countArr[A[i]%B]++;
        }
        long ans=0;
        ans+=(countArr[0]*(countArr[0]-1))/2;
        ans=ans%mod;
        int i=1;
        int j=B-1;
        while(i<=j){
            if(i==j){
                ans=(ans+((countArr[i]*(countArr[j]-1))/2)%mod)%mod;
            }
            else{
                ans=(ans+(countArr[i]*countArr[j])%mod)%mod;
            }
            i++;
            j--;
        }
        return (int)ans;
    }
}
