package Advanced.Day_34_GCD;

/*
 * Problem Description

Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.

Example Input

Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]

 Example Output

Output 1:

 6
Output 2:

 15


 Example Explanation

Explanation 1:

 
 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum vallue of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5
 */

public class DeleteOne {
    public int solve(int[] A) {
        if(A.length==2){
            return Math.max(A[0],A[1]);
        }

        int[] prefixGCD=new int[A.length];
        int[] suffixGCD=new int[A.length];
        prefixGCD[0]=A[0];
        for(int i=1;i<prefixGCD.length;i++){
            prefixGCD[i] = findGCD(prefixGCD[i-1], A[i]);
        }
        suffixGCD[A.length-1]=A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
            suffixGCD[i] = findGCD(suffixGCD[i+1], A[i]);
        }

        int ans=1;
        for(int i=1;i<A.length-1;i++){
            int temp=findGCD(prefixGCD[i-1],suffixGCD[i+1]);
            ans=Math.max(ans,temp);
        }
        return ans;
        
    }
    public int findGCD(int a, int b){
        if(b==0)
            return a;
        if(a>b)
            return findGCD(b,a);
        return findGCD(a,b%a);
    }
}
