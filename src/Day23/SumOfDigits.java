package Day23;

public class SumOfDigits {
    public int solve(int A) {
        if(A==0){
            return 0;
        }
        int lastDigit=A%10;
        return solve(A/10)+lastDigit;
    }
}
