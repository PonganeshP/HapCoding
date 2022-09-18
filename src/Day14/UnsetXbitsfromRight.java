package Day14;

public class UnsetXbitsfromRight {
    public Long solve(Long A, int B) {
        long res=0;
        res=A & ((~0)<<B);
        return res;
    }
}
