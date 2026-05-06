public class PerfectSumProblem {

    public int perfectSum(int[] nums, int target) {

        int sum = target;
        int n = nums.length;

        int[][]t = new int[n + 1][sum + 1];

        for(int j = 0; j < sum + 1; j++){
            t[0][j] = 0;
        }
        for(int i = 0; i < n + 1; i++){
            t[i][0] = 1;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < sum + 1; j++){
                if(nums[i - 1] <= j){
                    t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j];
                }
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];

    }
}