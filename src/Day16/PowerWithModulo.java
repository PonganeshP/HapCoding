package Day16;

public class PowerWithModulo {
    public int solve(int A, int B, int C) {
        long ans=1;
        for(int i=1;i<=B;i++){
            ans=(ans*(A%C))%C;
        }
        return (int)ans;
    }
}
