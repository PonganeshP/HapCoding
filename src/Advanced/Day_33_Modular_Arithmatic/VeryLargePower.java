package Advanced.Day_33_Modular_Arithmatic;

public class VeryLargePower {
    public int solve(int A, int B) {
        long mod=1000000007;
        long B2=factorial(B);
        int res=pow(A,B2%(mod-1),mod);
        return res;
    }
    public long factorial(int num){
        long mod=1000000007;
        if(num==1)
            return 1;
        return (num*factorial(num-1))%mod;
    }
    public int pow(int A, long B, long C) {
        if(A == 0)
            return 0;
        if(B == 0)
            return 1;
        long ans = pow(A, B / 2, C);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
            ans = (ans * A);
        ans = (ans + C) % C;
        return (int)ans;
    }
}
