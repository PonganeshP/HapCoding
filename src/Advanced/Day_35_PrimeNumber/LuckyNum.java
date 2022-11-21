package Advanced.Day_35_PrimeNumber;
/*
 * Problem Description
A lucky number is a number that has exactly 2 distinct prime divisors.

You are given a number A, and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).

Example Input
Input 1:

 A = 8
Input 2:

 A = 12

 Example Output
Output 1:

 1
Output 2:

 3


Example Explanation
Explanation 1:

 Between [1, 8] there is only 1 lucky number i.e 6.
 6 has 2 distinct prime factors i.e 2 and 3.
Explanation 2:

 Between [1, 12] there are 3 lucky number: 6, 10 and 12.
 */

public class LuckyNum {
    public int solve(int A) {
        int[] countArr=new int[A+1];
        for(int i=2;i<=A;i++){
            if(countArr[i]==0){
                for(int j=i;j<=A;j+=i){
                    countArr[j]++;
                }
            }
        }
        int res=0;
        for(int i=2;i<=countArr.length-1;i++){
            if(countArr[i]==2){
                res++;
            }
        }
        return res;
    }
}
