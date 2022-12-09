package Advanced.Day_40_Sorting_2;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Problem Description
We have a list A of points (x, y) on the plane. Find the B closest points to the origin (0, 0).

Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2 ).


Example Input
Input 1:

 A = [ 
       [1, 3],
       [-2, 2] 
     ]
 B = 1
Input 2:

 A = [
       [1, -1],
       [2, -1]
     ] 
 B = 1


Example Output
Output 1:

 [ [-2, 2] ]
Output 2:

 [ [1, -1] ]


Example Explanation
Explanation 1:

 The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 So one closest point will be [-2,2].
Explanation 2:

 The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 So one closest point will be [1,-1]
*/

public class BClosestOrigin {
    public int[][] solve(int[][] A, int B) {
        int N=A.length;
        int M=A[0].length;
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=(A[i][j]*A[i][j]);
            }
        }
        Arrays.sort(A,new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                long sum1=(long) (Math.pow(o1[0],2) + Math.pow(o1[1],2));
                long sum2=(long) (Math.pow(o2[0],2) + Math.pow(o2[1],2));
                return (int) (sum1-sum2);
            }
            
        });
        int[][] res= new int[B][M];
        for(int i=0;i<B;i++){
            for(int j=0;j<M;j++){
                res[i][j]=A[i][j];
            }
        }
        return res;
    }
}
