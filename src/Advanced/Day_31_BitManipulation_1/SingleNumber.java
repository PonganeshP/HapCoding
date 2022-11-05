package Advanced.Day_31_BitManipulation_1;

/*
 * Problem Description
Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?

Example Input
Input 1:

 A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]

 Example Output
Output 1:

 4

 Example Explanation
Explanation 1:

 4 occurs exactly once in Input 1.
 */

public class SingleNumber {
    public int singleNumber(final int[] A) {
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<A.length;j++){
                if((A[j]>>i & 1)==1){
                    count++;
                }
            }
            if(count%3!=0){
                ans=ans|(1<<i);
            }
        }
        return ans;
    }
}
