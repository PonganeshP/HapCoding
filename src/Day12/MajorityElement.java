package Day12;

import java.util.List;

// Problem Description
// Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
// You may assume that the array is non-empty and the majority element always exists in the array.

// Example Input
// [2, 1, 2]


// Example Output
// 2


public class MajorityElement { //using Boger Moore Majority voting algorithm
    public int majorityElement(final List<Integer> A) {
        int choosenOne=-1;
        int count=0;
        int maxCount=0;
        int maxEle=0;
        int halfN=A.size()/2;
        for(int i=0;i<A.size();i++){
            if(count>halfN){
                return choosenOne;
            }
            if(count==0){
                choosenOne=A.get(i);
                count++;
            }
            else if(A.get(i)==choosenOne){
                count++;
            }
            else{
                count--;
            }
            if(count>0){
                maxEle=choosenOne;
            }
        }
        int sum2=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==maxEle){
                sum2++;
            }
        }
        if(sum2>halfN){
            return choosenOne;
        }
        return -1;
    }
}
