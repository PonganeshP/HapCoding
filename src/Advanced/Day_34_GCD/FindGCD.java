package Advanced.Day_34_GCD;

public class FindGCD {
    public int gcd(int A, int B) {
        if(B==0)
            return A;
        if(A>B)
            return gcd(B,A);
        return gcd(A,B%A);
    }
}
