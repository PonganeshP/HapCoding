package Day02;

import java.util.ArrayList;

public class FindArmstrong {
    public ArrayList<Integer> solve(int A) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=1;i<=A;i++){
            int sum=0;
            int remDigit=i;
            while(true){
                int lastDigit=remDigit%10;
                sum+=Math.pow(lastDigit,3);
                remDigit=remDigit/10;
                if(remDigit==0){
                    break;
                }
            }
            if(sum<=A && sum==i){
                result.add(sum);
            }
        }
        return result;
    }
    
}
