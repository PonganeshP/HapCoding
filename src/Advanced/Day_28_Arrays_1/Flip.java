package Advanced.Day_28_Arrays_1;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.

Example Input
Input 1:

A = "010"
Input 2:

A = "111"

Example Output
Output 1:

[1, 1]
Output 2:

[]

Example Explanation
Explanation 1:

A = "010"

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
 */

public class Flip {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> arr=new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<A.length();i++){
            int temp=A.charAt(i)-'0';
            if(temp==0){
                arr.add(1);
                flag=false;
                continue;
            }
            arr.add(-1);
        }
        if(flag){
            return new ArrayList<>();
        }
        int currSum=0;
        int maxSum=0;
        int start=0;
        int end=-1;
        int L=0,R=0;
        for(int i=0;i<arr.size();i++){
            currSum+=arr.get(i);
            if(currSum>maxSum){
                start=L;
                end=R;
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
                L=i+1;
                R=L;
            }
            else{
                R++;
            }
        }

        return new ArrayList<Integer>(Arrays.asList(start+1,end+1));
    }
}
