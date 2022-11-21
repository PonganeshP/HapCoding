package Advanced.Day_35_PrimeNumber;
/*
 * Given an array A having N positive numbers. You have to find the number of Prime subsequences of A.

A Prime subsequence is one that has only prime numbers, for example [2, 3], [5] are the Prime subsequences where [2, 4] and [1, 2, 3, 4] are not.

For Example

Input:
    A = [1, 2, 3]
Output:
     3

Explanation:
    no. Subsequences      Prime subsequences
    1.  [1]                     No
    2.  [1, 2]                  No
    3.  [1, 3]                  No
    4.  [1, 2, 3]               No
    5.  [2]                     Yes
    6.  [2, 3]                  Yes
    7.  [3]                     Yes
    8.  []                      No

    here we have 3 subsequences(5, 6, 7) those have only prime number(s). 
 */

public class PrimeSubSequnce {
    public int solve(int[] A) {
        long ans=1;
        for(int i=0;i<A.length;i++){
            if(isPrime(A[i]) && A[i]!=1){
                ans=ans*2;
                ans=ans%1000000007;
            }
        }
        return (int)(ans-1);

    }
    public boolean isPrime(int num){
        int i=2;
        while(i*i<=num){
            if(num%i==0 && num!=i){
                return false;
            }
            i++;
        }
        return true;
    }
}
