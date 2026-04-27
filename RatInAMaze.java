import java.util.*;

public class RatInAMaze {

    ArrayList<String> ans = new ArrayList<>();
    public void solve(int row , int col, int[][] m, int [][]v,int n, String move){
        if(row == n - 1 && col == n - 1){
            ans.add(move);
            return;
        }

        // downward

        if(row + 1 < n  && v[row + 1][col] == 0 && m[row + 1][col] == 1){
            v[row + 1][col] = 1;
            solve(row + 1, col, m, v, n, move +"D");
            v[row + 1][col] = 0;
        }

        // left

        if(col - 1 >= 0 && v[row][col - 1] == 0 && m[row][col - 1] == 1){
            v[row][col - 1] = 1;
            solve(row, col - 1, m, v, n, move +"L");
            v[row][col - 1] = 0;
        }

        // upwards

        if(row - 1 >= 0 && v[row  -1][col] == 0 && m[row - 1][col] == 1){
            v[row - 1][col] = 1;
            solve(row - 1, col, m, v, n, move +"U");
            v[row - 1][col] = 0;
        }

        // right

        if(col + 1 < n  && v[row][col + 1] == 0 && m[row ][col + 1] == 1){
            v[row][col + 1] = 1;
            solve(row, col + 1, m, v, n, move +"R");
            v[row][col + 1] = 0;
        }

    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n = maze.length;

        int[][] visited = new int[n][n];
        if(maze[0][0] == 1){
            visited[0][0] = 1;
            solve(0,0,maze,visited,n,"");
        }
        Collections.sort(ans);
        return ans;
    }
}
