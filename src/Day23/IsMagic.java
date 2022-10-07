package Day23;

public class IsMagic {
    public int solve(int A) {
        int res=0;
        while(A>9){
            res=sumOfDigits(A);
            A=res;
        }
        if(A==1){
            return 1;
        }
        return 0;
    }
    public int sumOfDigits(int A) {
        if(A==0){
            return 0;
        }
        int lastDigit=A%10;
        return sumOfDigits(A/10)+lastDigit;
    }
}
