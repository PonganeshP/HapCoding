package Advanced.Day_30_Arrays_3;

/*
 *Problem Description
Given an integer A, find and return the 
total number of digit 1 appearing in all non-negative integers less than or equal to A. 



Example Input
Input 1:

 A = 10
Input 2:

 A = 11
 
 Example Explanation
Explanation 1:

Digit 1 appears in 1 and 10 only and appears one time in each. So the answer is 2.
Explanation 2:

Digit 1 appears in 1(1 time) , 10(1 time) and 11(2 times) only. So the answer is 4.
 */

public class NumberOfDigitOne {
    public int solve(int A) {
        int count=0;
        for(long i=1;i<=A;i*=10){
            long divider=i*10;
            count+=(A/divider)*i + Math.min(Math.max(A%divider-i+1,0L),i);
        }
        return count;
    }
}
