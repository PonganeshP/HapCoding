package Day13;

public class XORSum {
    public int solve(int A, int B) {
        int max=Math.max(A,B);
        return (A^max)+(B^max);
    }
}
