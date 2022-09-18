package Day14;


public class ToggleithBit {
    public int solve(int A, int B) {
        int m=1<<B;
        return A^m;
    }
}
