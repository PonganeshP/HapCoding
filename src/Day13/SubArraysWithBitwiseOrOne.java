package Day13;

import java.util.ArrayList;

public class SubArraysWithBitwiseOrOne {
    public Long solve(int A, ArrayList<Integer> B) {
        // long count=0;
        // for(int i=0;i<A;i++){
        //     for(int j=i;j<A;j++){
        //         // if(B.get(j)==0 && i==j){
        //         //     count++;
        //         // }
        //         // if(j+1<A && B.get(j)==0 && B.get(j+1)==0){
        //         //     count++;
        //         // }
        //         if(B.get(j)==1){
        //             break;
        //         }
        //         count++;
        //     }
        // }
        // int N=A*(A+1)/2;
        // long res=N-count;
        // return res;
        long last=0;
        long ans=0;
        for(int i=0;i<A;i++){
            if(B.get(i)==1){
                last=i+1;
            }
            ans+=last;
        }
        
        return ans;
    }
}
