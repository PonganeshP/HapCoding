package Advanced.Day_32_BitManipulation_2;

/*
 * Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order

Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]

Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]
 */

public class SingleNumberTwice {
    public int[] solve(int[] A) {
        int xor=0;
        int[] res=new int[2];
        for(int i=0;i<A.length;i++){
            xor^=A[i];
        }
        int pos=0;
        for(int i=0;i<31;i++){
            if((xor &(1<<i))>0){
               pos=i;
               break; 
            }
        }
        int xor1=0;
        int xor2=0;
        for(int i=0;i<A.length;i++){
            if((A[i] &(1<<pos))>0){
                xor1^=A[i];
            }
            else{
                xor2^=A[i];
            }
        }
    res[1]=xor1>xor2?xor1:xor2;
    res[0]=xor1<xor2?xor1:xor2;
    return res;
    }
}
