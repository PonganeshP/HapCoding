package Day14;

public class SetBit {
    public int solve(int A, int B) {
        int a=0+1;
        a=(a<<A);
        int b=0+1;
        b=(b<<B);
        int ans=(a|b);
        return ans;
    }
}
