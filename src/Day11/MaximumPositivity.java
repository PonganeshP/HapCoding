package Day11;

import java.util.ArrayList;

// Problem Description
// Given an array of integers A, of size N.

// Return the maximum size subarray of A having only non-negative elements. If there are more than one such subarray, return the one having the smallest starting index in A.

// NOTE: It is guaranteed that an answer always exists.

// Explanation 1:

//  There are two subarrays of size 2 having only non-negative elements.
//  1. [5, 6]  starting point  = 0
//  2. [7, 8]  starting point  = 3
//  As starting point of 1 is smaller, return [5, 6]
// Explanation 2:

//  There is only one subarray of size 6 having only non-negative elements:
//  [1, 2, 3, 4, 5, 6]



public class MaximumPositivity {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int min_start_index=Integer.MAX_VALUE;
        int start_index=0;
        int end_index=0;
        ArrayList<Integer> res=new ArrayList<>();
        int finalCount=0;
        int count=0;
        boolean flag=true;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                if(count>finalCount){
                    min_start_index=start_index;
                    end_index=i-1;
                }
                finalCount=Math.max(count,finalCount);
                count=0;
                flag=true;
            }
            else{
                count++;
                if(count>finalCount){
                    min_start_index=start_index;
                }
                if(flag){
                    flag=false;
                    start_index=i;
                }
            }
        }
        if(min_start_index>end_index){
            end_index=A.size()-1;
        }
        for(int i=min_start_index;i<=end_index;i++){
            res.add(A.get(i));
        }
        return res;
    }
}
