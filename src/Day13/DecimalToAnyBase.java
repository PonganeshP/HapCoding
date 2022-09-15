package Day13;

public class DecimalToAnyBase {
    public int DecimalToAnyBase(int A, int B) {
        String s="";
        StringBuilder res=new StringBuilder();
        if(A==0){
            return 0;
        }
        while(A>0){
            int rem=A%B;
            s=s.concat(String.valueOf(rem));
            A=A/B;
        }
        res.append(s);
        res=res.reverse();
        return Integer.parseInt(res.toString());
    }
}
