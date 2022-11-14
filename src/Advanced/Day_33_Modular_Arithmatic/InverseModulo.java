package Advanced.Day_33_Modular_Arithmatic;

/*
 * 
 * Problem Description
Given two integers A and B. Find the value of A-1 mod B where B is a prime number and gcd(A, B) = 1.

A-1 mod B is also known as modular multiplicative inverse of A under modulo B.


Example Input
Input 1:

 A = 3
 B = 5
Input 2:

 A = 6
 B = 23


Example Output
Output 1:

 2
Output 2:

 4


Example Explanation
Explanation 1:

 Let's say A-1 mod B = X, then (A * X) % B = 1.
 3 * 2 = 6, 6 % 5 = 1.
Explanation 2:

 Similarly, (6 * 4) % 23 = 1.
 */

public class InverseModulo {
    public int solve(int A, int B) {
        // BF Approach
        // for(long x=1;x<B;x++){
        //     if(((A%B)*(x%B))%B==1){
        //         return (int)x;
        //     }
        // }
        // return 1;
        long res=pow(A,B-2,B);
        return (int)res;
    }
    public long pow(int x,int y, int m){
        if(x==0){
            return 0;
        }
        if(y==0){
            return 1;
        }
        long t_x=pow(x,y/2,m);
        long sqr=(t_x%m * t_x%m)%m;
        if(y%2==1){
            sqr=(sqr*x)%m;
        }
        return sqr;
        
    }
    
}
