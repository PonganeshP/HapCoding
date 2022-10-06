package Day22;

public class FindFibboNum {
    public int findAthFibonacci(int A) {
        if(A<=1){
            return A;
        }
        return findAthFibonacci(A-1)+findAthFibonacci(A-2);
    }
}
