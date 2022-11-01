package Advanced.Day_28_Arrays_1;

import java.util.ArrayList;

/*
 * Problem Description
Given 4 array of integers A, B, C and D of same size, 
find and return the maximum value of 
| A [ i ] - A [ j ] | + | B [ i ] - B [ j ] | + | C [ i ] - C [ j ] | + | D [ i ] - D [ j ] | + | i - j|
 where i != j and |x| denotes the absolute value of x.

Example Input
Input 1:

 A = [1, 2, 3, 4]
 B = [-1, 4, 5, 6]
 C = [-10, 5, 3, -8]
 D = [-1, -9, -6, -10]

 Example Output
Output 1:

 30

 */


public class AbsMax {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {
        int n=A.size();
        int res=0;
        for(int i=0;i<16;i++){
            int maxi=Integer.MIN_VALUE;
            int mini=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                int currSum=A.get(j);
                for(int k=0;k<4;k++){
                    int temp=0;
                    if(k==0)
                        temp=B.get(j);
                    else if(k==1)
                        temp=C.get(j);
                    else if(k==2)
                        temp=D.get(j);
                    else
                        temp=j;
                    int k1=1<<k;
                    if((k1 & i) !=0){
                        currSum+=temp;
                    }
                    else
                        currSum-=temp;
                }
                maxi=Math.max(maxi, currSum);
                mini=Math.min(mini, currSum);
            }
            res=Math.max(res,maxi-mini);
        }
        
        return res;
    }
}
