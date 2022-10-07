package Day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        // ArrayList<Integer> res=new ArrayList<>();
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // boolean zeroFlag=false;
        // int zi=0;
        // for(int i=0;i<A.size();i++){
        //     if(!hm.containsKey(A.get(i))){
        //         hm.put(A.get(i),i);
        //     }
        //     else{
        //         if(A.get(i)==0){
        //             zeroFlag=true;
        //             zi=i;
        //         }
        //     }
        // }
        // if(hm.size()==1 && A.size()>1){
        //     if((A.get(0)+A.get(1))==B){
        //         res.add(1);
        //         res.add(2);
        //         return res;
        //     }
        // }
        // int end=Integer.MAX_VALUE;
        // int start=Integer.MAX_VALUE;
        // for(int i=0;i<A.size();i++){
        //     int a=A.get(i);
        //     int b=B-a;
        //     // hm.remove(a);
        //     // if(B==0 && A.get(i)==0 && zeroFlag && i<hm.get(b) && hm.get(b)<end){
        //     //     start=i;
        //     //     end=zi;
        //     // }
        //     if(B==0 && b==0 && a==0 && hm.get(b)<i && hm.get(b)<end && i<end){
        //         start=hm.get(b);
        //         end=i;
        //     }
        //     if(hm.containsKey(b)){
        //         if(i<hm.get(b) && hm.get(b)<end){
        //             start=i;
        //             end=hm.get(b);
        //         }
        //     }
        // }
        // if(end==Integer.MAX_VALUE){
        //     return res;
        // }
        // res.add(start+1);
        // res.add(end+1);
        // return res;
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<A.size();i++){
            int b=B-A.get(i);
            if(hm.containsKey(b)){
                res.add(hm.get(b)+1);
                res.add(i+1);
                return res;
            }
            if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i), i);
            }
        }
        return res;
    }
}
