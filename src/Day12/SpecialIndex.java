package Day12;

import java.util.ArrayList;

// Problem Description
// Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.


// Example Input
// Input 1:
// A=[2, 1, 6, 4]
// Input 2:

// A=[1, 1, 1]


// Example Output
// Output 1:
// 1
// Output 2:

// 3


public class SpecialIndex{
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> PSE=new ArrayList<Integer>();
        ArrayList<Integer> PSO=new ArrayList<Integer>();
        int evenSum=0;
        int oddSum=0;
        int count=0;
        for(int i=0;i<A.size();i++){
            if(i%2==0){
                evenSum+=A.get(i);
            }
            PSE.add(evenSum);
        }
        for(int i=0;i<A.size();i++){
            if(i%2!=0){
                oddSum+=A.get(i);
            }
            PSO.add(oddSum);
        }
        
        
        for(int i=0;i<A.size();i++){
            int sumOdd=0;
            int sumEven=0;
            if(i==0){
                sumOdd=(PSE.get(A.size()-1)-PSE.get(i));
                sumEven=(PSO.get(A.size()-1)-PSO.get(i));
                if(sumOdd==sumEven){
                    count++;
                }
            }
            else{
            sumOdd=PSO.get(i-1)+(PSE.get(A.size()-1)-PSE.get(i));
            sumEven=PSE.get(i-1)+(PSO.get(A.size()-1)-PSO.get(i));
            if(sumOdd==sumEven){
                count++;
            }
            }
        }
        return count;
    }
}