package Day14;

public class UnsetithBit {
    public int solve(int A, int B) {
        if(setOrUnset(A,B)){
            A = A & (~(1<<B));
        }
        return A;
    }
    public boolean setOrUnset(int N,int i){
        N=N>>i;
        if((N&1)==1){
            return true;
        }
        return false;
    }
}
