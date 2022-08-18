package Day02;

public class SumEvens {
    public int solve(int A) {
        int sum=0;
        for(int i=2;i<=A;i=i+2){
            sum+=i;
        }
        return sum;
    }
}
