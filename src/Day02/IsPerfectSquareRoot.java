package Day02;

public class IsPerfectSquareRoot {
    public int solve(int A) {
        for(int i=1;i*i<=A;i++){
            if(i*i == A){
                return i;
            }
        }
        return -1;
    }
}
