package Advanced.Day_34_GCD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/*
 * Problem Description
Given an array of integers A of size N containing GCD of every possible pair of elements of another array.

Find and return the original numbers used to calculate the GCD array in any order. For example, if original numbers are {2, 8, 10} then the given array will be {2, 2, 2, 2, 8, 2, 2, 2, 10}.


Example Input
Input 1:

 A = [2, 2, 2, 2, 8, 2, 2, 2, 10]
Input 2:

 A = [5, 5, 5, 15]


Example Output
Output 1:

 [2, 8, 10]
Output 2:

 [5, 15]

 Example Explanation
Explanation 1:

 Initially, array A = [2, 2, 2, 2, 8, 2, 2, 2, 10].
 2 is the gcd between 2 and 8, 2 and 10.
 8 and 10 are the gcds pair with itself.
 Therefore, [2, 8, 10] is the original array.
Explanation 2:

 Initially, array A = [5, 5, 5, 15].
 5 is the gcd between 5 and 15.
 15 is the gcds pair with itself.
 Therefore, [5, 15] is the original array
 */

public class AllGCDPairs {
    public int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int A_size=A.size();
        if (A_size<=2) return A;
        res.add(A.get(0));
        res.add(A.get(1));
        map.put(gcd(A.get(0),A.get(1)),2);

        for (int i=2;i<A_size;i++){
            if (map.containsKey(A.get(i)))
                if (map.get(A.get(i))==0)
                    map.remove(A.get(i));
                else
                    map.put(A.get(i),map.get(A.get(i))-1);
            else{
                for (int j=res.size()-1;j>=0;j--){
                    int tempGCD=gcd(res.get(j),A.get(i));
                    if (!map.containsKey(tempGCD))
                        map.put(tempGCD,2);
                    else
                        map.put(tempGCD,map.get(tempGCD)+2);
                }
                res.add(A.get(i));
            }

        }
        return res;
    }
}
