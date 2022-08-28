package Day07;

import java.util.ArrayList;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int min=-1;
        int max=-1;
        int minElement=0;
        int maxElement=0;
        int l=0;
        int res=0;
        boolean flag=false;

        if(A.size()==1){
            return 1;
        }

        for(int i=0;i<A.size();i++){
            if(A.get(i)>maxElement || i==0){
                maxElement=A.get(i);
            }
            if(A.get(i)<minElement || i==0){
                minElement=A.get(i);
            }
        }
        
        for(int i=0;i<A.size();i++){
            if(i+1<A.size() && A.get(i)!=A.get(i+1)){
                flag=true;
            }
            if(A.get(i)==minElement){
                min=i;
            }
            else if(A.get(i)==maxElement){
                max=i;
            }
            if(min>-1 && max>-1){
                if(min>max){
                    l=min-max+1;
                }
                else{
                    l=max-min+1;
                }
            }
            if(l<res || res==0){
                res=l;
            }
        }

        if(flag==false){
            return 1;
        }
        return res;
    }
}
