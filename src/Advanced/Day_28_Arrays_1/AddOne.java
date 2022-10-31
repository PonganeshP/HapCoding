package Advanced.Day_28_Arrays_1;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

Example Input
Input 1:

[1, 2, 3]

Example Output
Output 1:

[1, 2, 4]

Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.

 */

public class AddOne {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> resArray=new ArrayList<>();
        Collections.reverse(A);
        int carry=1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==9 && carry==1){
                resArray.add(0);
                carry=1;
            }
            else{
                resArray.add(A.get(i)+carry);
                carry=0;
            }
        }
        if(carry==1){
            resArray.add(carry);
        }
        Collections.reverse(resArray);
        for(int i=0;i<resArray.size();i++){
            if(resArray.get(0)==0){
                resArray.remove(0);
            }
            else{
                break;
            }
        }
        return resArray;
    }
}


