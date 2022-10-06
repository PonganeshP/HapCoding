package Day22;

public class CheckPallindrome {
    public int solve(String A) {
        boolean palli=checkPalli(A, 0, A.length()-1);
        if(palli){
            return 1;
        }
        return 0;
    }
    public boolean checkPalli(String A, int s,int e){
        if(s>=e){
            return true;
        }
        int s1=s+1;
        int e1=e-1;
        if(A.charAt(s)==A.charAt(e) && checkPalli(A, s1, e1)){
            return true;
        }
        return false;
    }
}
