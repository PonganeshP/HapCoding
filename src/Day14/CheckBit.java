package Day14;

public class CheckBit {
    public int solve(int A, int B) {
        A=A>>B;
        if((A&1)==0){
            return 0;
        }
        return 1;
    }
}
