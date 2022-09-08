package Day11;

public class ConsecutiveOne {
    public int solve(String A) {
        int ans=Integer.MIN_VALUE;
        int countLeft=0,countRight=0;
        int i=0;
        int totalOnes=0;
        for(i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                totalOnes++;
            }
        }
        for(i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                countRight++;
            }
            else{
                break;
            }
        }
        int total=0;
        int j=0;
        while(i<A.length()){
            if(A.charAt(i)=='0'){
                countLeft=countRight;
                countRight=0;
                for(j=i+1;j<A.length();j++){
                    if(A.charAt(j)=='1'){
                        countRight++;
                    }
                    else{
                        break;
                    }
                }
                total=countLeft+countRight;
                if(total<totalOnes){
                    total++;
                }
                ans=Math.max(ans, total);
                i=j;
            }
        }
        if(ans==Integer.MIN_VALUE){
            ans=A.length();
        }

        return ans;
    }
}
