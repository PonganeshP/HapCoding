package Advanced.Day_39_Sorting_1;

/*
 * Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.


Example Input
Input 1:

A = [4, 7, 9 ]
B = [2, 11, 19 ]
Input 2:

A = [1]
B = [2]


Example Output
Output 1:

[2, 4, 7, 9, 11, 19]
Output 2:

[1, 2]
 */

public class MergeTwoSorted {
    public int[] solve(final int[] A, final int[] B) {
        int[] op=new int[A.length+B.length];
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                op[k]=A[i];
                i++;
                k++;
            }
            else if(B[j]<A[i]){
                op[k]=B[j];
                j++;
                k++;
            }
            else{
                op[k]=A[i];
                op[k+1]=B[j];
                k=k+2;
                i++;
                j++;
            }
        }
        while(i<A.length){
            op[k]=A[i];
            i++;
            k++;
        }
        while(j<B.length){
            op[k]=B[j];
            j++;
            k++;
        }
        return op;
    }
}
