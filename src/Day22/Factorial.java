package Day22;

public class Factorial {
    public int solve(int A) {
        if(A==1){
            return 1;
        }
        return solve(A-1)*A;
    }
}
