package Day02;

public class IsPerfectSquare {
    public int solve(int A) {
        for(int i=1;i*i<=A;i++){
            if(i*i==A){
                return 1;
            }
        }
        return 0;
    }
}
