package Advanced.Day_28_Arrays_1;

import java.util.ArrayList;


/*
 * Problem Description
You are given an array of N integers, A1, A2, .... AN.

Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. 
f(i, j) is defined as |A[i] - A[j]| + |i - j|,  where |x| denotes absolute value of x.


A = [1, 3, -1]

Output 1:

5


Explanation 1:

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
 */

public class MaxAbsDiff {
    public int maxArr(ArrayList<Integer> A) {
        int xMax=Integer.MIN_VALUE;
        int yMax=Integer.MIN_VALUE;
        int xMin=Integer.MAX_VALUE;
        int yMin=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            int x=A.get(i)+i;
            int y=A.get(i)-i;
            xMax=Math.max(xMax,x);
            xMin=Math.min(xMin,x);
            yMax=Math.max(yMax,y);
            yMin=Math.min(yMin,y);
        }
        ans=Math.max(xMax-xMin,yMax-yMin);
        return ans;
    }
}
