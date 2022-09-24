package Day17;
import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger{
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        int count=0;
        for(int i=1;i<A.size();i++){
            if(A.get(i)<0){
                break;
            }
            if(A.get(i)!=A.get(i-1)){
                count=i;
            }
            if(count==A.get(i)){
                return 1;
            }
        }
        if(A.get(0)==0){
            return 1;
        }
        return -1;
    }
}