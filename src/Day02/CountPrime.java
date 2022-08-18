package Day02;

public class CountPrime {
    
    public boolean isPrime(int N){
        for(int j=3;j<=N;j++){
            if(N%j==0 && j!=N){
                return false;
            }
        }
        return true;
    }


    public int solve(int A) {
        int count=1;
        if(A==2){
            return 1;
        }
        else if(A>2){
            for(int i=3;i<=A;i=i+2){
                if(isPrime(i)){
                    count++;
                }
            }
        return count;
        }
        return 0;
    }
}
