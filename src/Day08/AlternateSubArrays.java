package Day08;

import java.util.ArrayList;

public class AlternateSubArrays {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int L=(2*B)+1;
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(B==0){
            for(int i=0;i<A.size();i++){
                res.add(i);
            }
            return res;
        }
        for(int i=0;i<A.size();i++){
            int leftElements=i;
            int rightElements=(A.size()-1)-i;
            if(leftElements>=L/2 && rightElements>=L/2){
                boolean flag=false;
                int ele=A.get(i);
                for(int c=1;c<=B;c++){
                    if(A.get(i-c)==A.get(i+c) && ele!=A.get(i-c) && ele!=A.get(i+c)){
                        ele=ele==0? 1:0;
                        flag=true;
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    res.add(i);
                }
            }
        }
        return res;
    }
}
