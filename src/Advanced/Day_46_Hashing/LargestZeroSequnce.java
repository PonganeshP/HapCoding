package Advanced.Day_46_Hashing;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Problem Description
Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.


Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.


 */

public class LargestZeroSequnce {
    public int[] lszero(int[] A) {
        int N=A.length;
        int[] PS=new int[N];
        int temp=0;
        for(int i=0;i<N;i++){
            temp+=A[i];
            PS[i]=temp;
        }
        int res=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        boolean flag=false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            if(PS[i]==0){
                if((i+1)>res){
                    flag=true;
                    end=i;
                    start=0;
                }
                res=Math.max(res,i+1);
            }
            if(hm.containsKey(PS[i])){
                if((i-hm.get(PS[i]))>res){
                    flag=true;
                    end=i;
                    start=hm.get(PS[i])+1;
                }
                res=Math.max(res,i-hm.get(PS[i]));
            }
            else{
                hm.put(PS[i],i);
            }
        }
        return (flag==true)?Arrays.copyOfRange(A, start, end+1): new int[0];

    }
}
