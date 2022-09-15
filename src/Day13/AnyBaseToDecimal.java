package Day13;

public class AnyBaseToDecimal {
    public int solve(int A, int B) {
        int sum=0;
        int i=0;
        while(A>0){
            int rem=A%10;
            sum+=rem*Math.pow(B,i);
            i++;
            A=A/10;
        }
        return sum;
    }
}
