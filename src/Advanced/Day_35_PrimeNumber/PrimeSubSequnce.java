package Advanced.Day_35_PrimeNumber;

public class PrimeSubSequnce {
    public int solve(int[] A) {
        long ans=1;
        for(int i=0;i<A.length;i++){
            if(isPrime(A[i]) && A[i]!=1){
                ans=ans*2;
                ans=ans%1000000007;
            }
        }
        return (int)(ans-1);

    }
    public boolean isPrime(int num){
        int i=2;
        while(i*i<=num){
            if(num%i==0 && num!=i){
                return false;
            }
            i++;
        }
        return true;
    }
}
