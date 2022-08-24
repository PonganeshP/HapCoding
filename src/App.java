import java.util.ArrayList;
import java.util.Arrays;

import Day02.IsPrime;
import Day05.ArrayRotation;
import Day05.GreaterThanItself;
import Day05.Reverse;
import Day05.ReverseRange;

public class App {
    public static void main(String[] args) throws Exception {
        var s1=new ArrayRotation();
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(7, 4, 2, 10, 5 ));
        System.out.println("Result: " + s1.solve(A,2));
    }
}
