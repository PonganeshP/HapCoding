package Day10;

import java.util.ArrayList;

public class SpiralPrint {
    
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int N=A;
        int i=0, j=0, c=1;
        

        for(int i2=1;i2<=N;i2++){
            result.add(new ArrayList<Integer>());
        }

        if(A==1){
            for(ArrayList<Integer> r:result){
            for(int i3=0;i3<N;i3++){
                r.add(i3,1);
            }
        }
        }
        else{
        for(ArrayList<Integer> r:result){
            for(int i3=0;i3<N;i3++){
                r.add(i3,0);
            }
        }
        }

        

        while(N>1){
            for(int k=0;k<(N-1);k++){
                result.get(i).set(j,c);
                j++;
                c++;
            }
            for(int k=0;k<(N-1);k++){
                result.get(i).set(j,c);
                i++;
                c++;
            }
            for(int k=0;k<(N-1);k++){
                result.get(i).set(j,c);
                j--;
                c++;
            }
            for(int k=0;k<(N-1);k++){
                result.get(i).set(j,c);
                i--;
                c++;
            }
            i++;
            j++;
            N=N-2;
        }

        if(N==1){
            result.get(i).set(j,c);
        }
        return result;
    }
}
