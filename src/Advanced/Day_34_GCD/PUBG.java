package Advanced.Day_34_GCD;
/*
 * Problem Description
There are N players, each with strength A[i]. when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches zero, it loses the game, and the game continues in the same manner among other players until only 1 survivor remains.

Can you tell the minimum health last surviving person can have?

Example Input
Input 1:

 A = [6, 4]
Input 2:

 A = [2, 3, 4]

 Example Output
Output 1:

 2
Output 2:

 1


 Example Explanation
Explanation 1:

 Given strength array A = [6, 4]
 Second player attack first player, A =  [2, 4]
 First player attack second player twice. [2, 0]
Explanation 2:

 Given strength array A = [2, 3, 4]
 First player attack third player twice. [2, 3, 0]
 First player attack second player. [2, 1, 0]
 Second player attack first player twice. [0, 1, 0]
 */



 // Common GCD in array
public class PUBG {
    public int solve(int[] A) {
        int gcd=A[0];
        for(int i=1;i<A.length;i++){
            gcd=findGCD(gcd,A[i]);
        }
        return gcd;
    }
    public int findGCD(int a, int b){
        if(b==0)
            return a;
        if(a>b)
            return findGCD(b,a);
        return findGCD(a,b%a);
    }
    
}
