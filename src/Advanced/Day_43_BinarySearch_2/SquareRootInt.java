package Advanced.Day_43_BinarySearch_2;

/*
 * Problem Description
Given an integer A.

Compute and return the square root of A.

If A is not a perfect square, return floor(sqrt(A)).

DO NOT USE SQRT FUNCTION FROM THE STANDARD LIBRARY.

NOTE: Do not use the sqrt function from the standard library. Users are expected to solve this in O(log(A)) time.



Example Input
Input 1:

 11
Input 2:

 9


Example Output
Output 1:

 3
Output 2:

 3


Example Explanation
Explanation:

 When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 When A = 9 which is a perfect square of 3, so we return 3.
 */

public class SquareRootInt {
    public int sqrt(int A) {
        long l=1;
        long r=A;
        while(l<=r){
            long mid=(l+r)/2;
            long sq=mid*mid;
            long sq_add=(mid+1) * (mid+1);
            if((sq==A)||((sq_add>A)) && (sq<A)){
                return (int)mid;
            }
            if(sq>A){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return (int)r;
    }
}
