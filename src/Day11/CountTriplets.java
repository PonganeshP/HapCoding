package Day11;

import java.util.ArrayList;

// Problem Description
// You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]


// Example Input
// Input 1:
// A = [1, 2, 4, 3]
// Input 2:
// A = [2, 1, 2, 3]


// Example Output
// Output 1:
// 2
// Output 2:
// 1

public class CountTriplets {
    public int solve(ArrayList<Integer> A) {
        int total=0;
        for(int j=0;j<A.size();j++){
            int counti=0;
            int countk=0;
            for(int i=j-1;i>=0;i--){
                if(A.get(i)<A.get(j)){
                    counti++;
                }
            }
            for(int k=j+1;k<A.size();k++){
                if(A.get(k)>A.get(j)){
                    countk++;
                }
            }
            total+=(counti*countk);
        }
        return total;
    }
}
