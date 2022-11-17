package Advanced.Day_34_GCD;
/*
 * Problem Description
You are given a number A and a number B. Greatest Common Divisor (GCD) of all numbers between A and B inclusive is taken (GCD(A, A+1, A+2 ... B)).
As this problem looks a bit easy, it is given that numbers A and B can be in the range of 10100.

You have to return the value of GCD found.

The greatest common divisor of 2 numbers, A and B, is the largest number, D that divides both A and B perfectly.


Example Input
A = "1"
B = "3"


Example Output
1
 */
public class EnumerateGCD {
    public String solve(String A, String B) {
        return A.equals(B)?A:"1";
    }
}
