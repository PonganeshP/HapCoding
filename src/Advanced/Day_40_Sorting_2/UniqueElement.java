package Advanced.Day_40_Sorting_2;

import java.util.Arrays;

/*
 * Problem Description
You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.

Find the minimum number of steps.

Example Input
Input 1:

 A = [1, 1, 3]
Input 2:

 A = [2, 4, 5]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 We can increase the value of 1st element by 1 in 1 step and will get all unique elements. i.e [2, 1, 3].
Explanation 2:

 All elements are distinct.
 */

public class UniqueElement {
    public int solve(int[] A) {
        /*
        Brute Forece Approch:


         * Arrays.sort(A);
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            while(hs.contains(A[i])){
                A[i]+=1;
                count++;
            }
            hs.add(A[i]);
        }
        return count;
         */

        Arrays.sort(A);
        int count=0;
        for(int i=1;i<A.length;i++){
            if(A[i]==A[i-1]){
                A[i]+=1;
                count++;
            }
            else if(A[i]<A[i-1]){
                int temp=A[i];
                A[i]=A[i-1]+1;
                count+=(A[i]-temp);
            }
        }
        return count;
    }
}
