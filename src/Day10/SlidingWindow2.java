package Day10;

import java.util.ArrayList;

public class SlidingWindow2 {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int win = 0;
        for (int i = 0; i < n; i++) {
            if (A.get(i) <= B) {
                win++;
            }
        }
        int swap = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < win; i++) {
            if (A.get(i) > B)
                swap++;
        }
        ans = Math.min(ans, swap);
        for (int i = win; i < n; i++) {
            if (A.get(i - win) <= B && A.get(i) > B)
                swap++;
            else if (A.get(i - win) > B && A.get(i) <= B)
                swap--;
            ans = Math.min(ans, swap);
        }
        return ans;
    }
}
