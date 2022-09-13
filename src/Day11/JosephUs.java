package Day11;

// Problem Description
// There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. This process continues till there is only 1 person remaining. Find the last person standing in the circle.
// Example Input
// Input 1:
// A = 4
// Input 2:
// A = 5


// Example Output
// Output 1:
// 1
// Output 2:
// 3


public class JosephUs {
    public int solve(int A) {
        int p = (int)(Math.log(A) /Math.log(2));
	    int pow = (int)Math.pow(2, p);
        int l=A-pow;
        return (2*l)+1;
    }
}
