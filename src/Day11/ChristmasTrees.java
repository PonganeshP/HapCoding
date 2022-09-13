package Day11;

import java.util.ArrayList;

// Problem Description
// You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
// The cost of these trees is Bp + Bq + Br.

// You are to choose 3 trees such that their total cost is minimum. Return that cost.

// If it is not possible to choose 3 such trees return -1.

// Example Input
// Input 1:

//  A = [1, 3, 5]
//  B = [1, 2, 3]
// Input 2:

//  A = [1, 6, 4, 2, 6, 9]
//  B = [2, 5, 7, 3, 2, 7]


// Example Output
// Output 1:

//  6 
// Output 2:

//  7 



public class ChristmasTrees{
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int ans=Integer.MAX_VALUE;
        for(int j=1;j<A.size()-1;j++){
            int res=Integer.MAX_VALUE;
            int min_k=Integer.MAX_VALUE;
            int min_i=Integer.MAX_VALUE;
            for(int i=j-1;i>=0;i--){
                if(A.get(i)<A.get(j)){
                    min_i=Math.min(min_i,B.get(i));
                }
            }
            for(int k=j+1;k<A.size();k++){
                if(A.get(k)>A.get(j)){
                    min_k=Math.min(min_k,B.get(k));
                }
            }
        
            res=min_i+B.get(j)+min_k;
            ans=Math.min(res,ans);
        }
        return ans;
    }
}