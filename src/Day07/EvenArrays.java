package Day07;

import java.util.ArrayList;

public class EvenArrays {
    public String solve(ArrayList<Integer> A) {
        // int N=A.size();
        // int l=0;
        // int start=0;
        // for(int i=0;i<A.size();i++){
        //     if(i<N){
        //     if(A.get(i)%2==0){
        //         if(A.get(N-1)%2==0){
        //             l=(N-1)-i+1;
        //             if(l%2==0){
        //                 if(A.get((N+1)/2)%2==0 && A.get(N/2)%2==0){
        //                     return "YES";
        //                 }
        //             }
        //         }
        //         else{
        //             N--;
        //         }
        //     }
        //     }
        // }

        // for(int i=N-1;i>=0;i--){
        //     if(A.get(i)%2==0){
        //         if(A.get(start)%2==0){
        //             l=i-start+1;
        //             if(l%2==0){
        //                 if(A.get((N+1)/2)%2==0 && A.get(N/2)%2==0){
        //                     return "YES";
        //                 }
        //             }
        //         }
        //         else{
        //             start++;
        //         }
        //     }
        // }

        // return "NO";
        if(A.get(0)%2==0 && A.get(A.size()-1)%2==0){
            if(((A.size()-1)-0+1)%2==0){
                return "YES";
            }
        }
        return "NO";
    }
}
