package Day07;

import java.util.ArrayList;

public class PickBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int N=A.size();
        var LA=LA(A);
        var RA=RA(A);
        int max=0;
        for(int i=B-1;i>=0;i--){
            if(i==B-1){
                max=LA.get(i);
                continue;
            }
            if((LA.get(i)+RA.get(N-1))>max){
                max=LA.get(i)+RA.get(N-1);
            }
            N--;
        }
        
        //Consider all test cases
        if(RA.get(N-1) > max){               //the mistake I did was not taking this test case
            max = RA. get(N - 1);
        }
        return max;
    }
    public ArrayList<Integer> LA(ArrayList<Integer> A){
        var res=new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            res.add(sum);
        }
        return res;
    }
    public ArrayList<Integer> RA(ArrayList<Integer> arr){
        int sum=0;
        for(int i=arr.size()-1;i>=0;i--){
            sum+=arr.get(i);
            arr.set(i,sum);
        }
        return arr;
    }

}
