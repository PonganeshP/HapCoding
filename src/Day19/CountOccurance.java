package Day19;

public class CountOccurance {
    public int solve(String A) {
        int count=0;
        for(int i=0;i<A.length()-2;i++){
            if(A.charAt(i)==98){
                if(A.charAt(i+1)==111 && A.charAt(i+2)==98){
                    count++;
                }
            }
        }
        return count;
    }
}
