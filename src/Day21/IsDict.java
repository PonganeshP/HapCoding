package Day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class IsDict {
    public int solve(ArrayList<String> A, String B) {
        int id[] = new int[26];
        for(int i = 0; i < B.length(); ++i){
            id[B.charAt(i)-'a'] = i;
        }
        for(int i = 0; i+1 < A.size(); ++i){
            String x = A.get(i);
            String y = A.get(i+1);
            int n = Math.min(x.length(), y.length());
            int fl = 0;
            for(int j = 0; j < n; ++j){
                int c1 = x.charAt(j)-'a';
                int c2 = y.charAt(j)-'a';
                if(c1 == c2){
                    continue;
                }
                if(id[c1] < id[c2]){
                    fl = 1;
                    break;
                }
                return 0;
            }
            if(fl == 0 && x.length() > y.length()){
                return 0;
            }
        }
        return 1;
    }
}
