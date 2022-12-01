package Advanced.Day_29_Arrays_2;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Problem Description
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)]. It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.

Example Input
Input 1:

A = [1, 2, 3, 4, 0]
Input 2:

A = [2, 0, 1, 3]


Example Output
Output 1:

4
Output 2:

2


Example Explanation
Explanation 1:

 If you swap (1, 2) -> (2, 3) -> (4, 0) -> (3, 0). You will get a sorted array.
 You cannot sort it with lesser swaps.
Explanation 2:

 You cannot sort it with lesser than 2 swaps.
 */

public class SortMinimumSwap {
    public int solve(int[] A) {
        int[] sortedArray=A.clone();
        Arrays.sort(sortedArray);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length;i++){
            hm.put(A[i],i);
        }
        int swap=0;
        for(int i=0;i<A.length;i++){
            while(hm.get(sortedArray[i])!=i){
                swap++;
                sortedArray= swap(sortedArray,i,hm.get(sortedArray[i]));
            }
        }
        return swap;

    }
    public int[] swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];arr[y]=temp;
        return arr;
    }
}
