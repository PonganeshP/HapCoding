package Day11;

public class JosephUs {
    public int solve(int A) {
        int p = (int)(Math.log(A) /Math.log(2));
	    int pow = (int)Math.pow(2, p);
        int l=A-pow;
        return (2*l)+1;
    }
}
