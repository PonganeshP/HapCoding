package Advanced.Day_31_BitManipulation_1;

public class DivideInteger {
    public int divide(int A, int B) {
       //method
		// A/B => 125/5 ==> 
		// 125 = 5*25 ==> 5 * ( 2^4 * (1) + 2^3 * (1) + 2^2* (0) + 2^1 * (0)+ 2^0 * (1) );
		boolean sign = (A<0) ^ (B<0);
		long ans = 0L;
		long tempA = Math.abs(A * 1L);
		long tempB = Math.abs(B * 1L);

		for (int i = 31; i >= 0; i--) {
            long power = (long) tempB<< i;
			while (power<= tempA) {
				tempA -= power;
				ans += (1L<< i);
			}
        }
		if (ans >= Integer.MAX_VALUE)
			return (sign ? -Integer.MIN_VALUE : Integer.MAX_VALUE);
		if (sign)
			return (int) ans * -1;
		return (int) ans;

    }
}
