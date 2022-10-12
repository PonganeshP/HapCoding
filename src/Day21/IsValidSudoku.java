package Day21;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsValidSudoku {
    public int isValidSudoku(final List<String> A) {
        Set hs=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num=A.get(i).charAt(j);
                if(num!='.'){
                    if (!hs.add(num + " in row " + i) ||
                    !hs.add(num + " in column " + j) ||
                    !hs.add(num + " in block " + i/3 + "-" + j/3))
                    return 0;
                }
            }
        }
        return 1;
    }
}
