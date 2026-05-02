public class Knapsack01 {

    public int solve(int[] wt, int[] val, int W, int n, int[][]t){
        if(n == 0 || W == 0) return 0;

        if(t[n][W] != -1) return t[n][W];

        if(wt[n - 1] <= W){
            t[n][W] = Math.max(val[n - 1] + solve(wt, val, W - wt[n - 1], n - 1, t), solve(wt, val, W, n - 1, t));

        }
        else{
            t[n][W] = solve(wt, val, W, n - 1, t);
        }
        return t[n][W];
    }

    public int knapsack(int W, int val[], int wt[]) {

        int n = val.length;
        int[][] t = new int[n + 1][W + 1];

        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < W + 1; j++){
                t[i][j] = -1;
            }
        }
        return solve(wt, val, W, n, t);
    }
}
