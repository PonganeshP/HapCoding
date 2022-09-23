package Day16;

public class RectangleOverlap {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if((B>=H && B>=F) || (F>=D && F>=B)){
            return 0;
        }
        if((E>=C && E>=A) || (G<=C  && G<=A)){
            return 0;
        }
        return 1;
    }
}
