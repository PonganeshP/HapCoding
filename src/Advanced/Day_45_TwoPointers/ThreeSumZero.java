package Advanced.Day_45_TwoPointers;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Problem Description

Given an array A of N integers, are there elements a, b, c in S such that a + b + c = 0

Find all unique triplets in the array which gives the sum of zero.

Note:

Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) The solution set must not contain duplicate triplets.




Example Input

A = [-1,0,1,2,-1,4]


Example Output

[ [-1,0,1],
  [-1,-1,2] ]


Example Explanation

Out of all the possible triplets having total sum zero,only the above two triplets are unique.


 */


public class ThreeSumZero {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<A.size()-1;i++){
            int x=A.get(i);
            int l=i+1;
            int r=A.size()-1;
            while(l<r){
                if((x+A.get(l)+A.get(r))==0){
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.add(x);
                    arr.add(A.get(l));
                    arr.add(A.get(r));
                    if(!res.contains(arr)){
                        res.add(arr);
                    }
                    l++;
                    r--;
                }
                else if((x+A.get(l)+A.get(r))<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}
