package Advanced.Day_46_Hashing;

import java.util.HashMap;

/*
 * Problem Description
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.


Example Input
Input 1:

 A = [1, 2, 1, 3, 4, 3]
 B = 3
Input 2:

 A = [1, 1, 2, 2]
 B = 1


Example Output
Output 1:

 [2, 3, 3, 2]
Output 2:

 [1, 1, 1, 1]


Example Explanation
Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].

 
 */

public class DistinctNumInWindow {
    public int[] dNums(int[] A, int B) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int count=0;
        int[] res=new int[A.length-B+1];
        for(int i=0;i<B;i++){
            if(!hm.containsKey(A[i])){
                hm.put(A[i],0);
                count++;
            }
            hm.put(A[i],hm.get(A[i])+1);
        }
        res[0]=count;
        for(int i=1;i<=A.length-B;i++){
            hm.put(A[i-1],hm.get(A[i-1])-1);
            if(hm.get(A[i-1])==0){
                hm.remove(A[i-1]);
            }
            count=hm.size();
            if(!hm.containsKey(A[B+(i-1)])){
                hm.put(A[B+(i-1)],0);
                count++;
            }
            hm.put(A[B+(i-1)],hm.get(A[B+(i-1)])+1);
            res[i]=count;
        }

        return res;
    }
}
