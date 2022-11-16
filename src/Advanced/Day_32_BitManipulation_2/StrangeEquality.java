package Advanced.Day_32_BitManipulation_2;

public class StrangeEquality {
    public int solve(int A) {
        /*
            Intuition:
            
            Remember this
            A+B=(A^B)+(A&B)*2

            From the prblm statement we can see, we need (A+B)==(A^B)
            to do this we need (A&B)==0 here x=A, y=B

            ways to make x&y==0
            x->unset all set bits and set all bits to unset
            y->set the A's (MSB th bit + 1)

        */
        int x=0;
        int y=0;
        int l=(int)(Math.log(A)/Math.log(2));
        for(int i=l;i>=0;i--){
            if(((A>>i)&1)==0){
                x|=(1<<i);
            }
        }
        y|=(1<<l+1);
        return (x^y);
    }
}
