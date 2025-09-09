public class fourDirectionMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 2;
        boolean[][] isVisited = new boolean[rows][cols];
        print(0, 0, rows-1, cols-1, isVisited, "");
    }

    public static void print(int sr, int sc, int er, int ec, boolean[][] isVisited, String s){
        if(sr < 0 || sc < 0)    return;
        if(sr > er || sc > ec)    return;
        if(isVisited[sr][sc] == true)   return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        
        isVisited[sr][sc] = true;
        print(sr+1, sc, er, ec, isVisited, s + "R");
        print(sr, sc+1, er, ec, isVisited, s + "D");
        print(sr-1, sc, er, ec, isVisited, s + "L");
        print(sr, sc-1, er, ec, isVisited, s + "U");
        isVisited[sr][sc] = false;
    }
}
