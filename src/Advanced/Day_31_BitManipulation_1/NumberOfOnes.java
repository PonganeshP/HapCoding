package Advanced.Day_31_BitManipulation_1;

/*
 * Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.

Example Input
Input1:
11

Example Output
Output1:
3


Explaination1:
11 is represented as 1011 in binary.
 */

public class NumberOfOnes {
    public int numSetBits(int A) {
        int l=(int) (Math.log(A)/Math.log(2));
        int count=0;
        for(int i=0;i<l+1;i++){
            if((A>>i&1)==1){
                count++;
            }
        }
        return count;
    }
}
