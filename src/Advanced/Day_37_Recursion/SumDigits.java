package Advanced.Day_37_Recursion;

public class SumDigits {
    public int solve(int A) {
        if(A<=0){
            return 0;
        }
        return A%10+solve(A/10);
    }
}
