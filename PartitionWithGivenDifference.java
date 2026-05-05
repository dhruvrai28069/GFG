public class PartitionWithGivenDifference {

    public int countPartitions(int[] arr, int diff) {

        int n = arr.length;
        int sum = 0;
        for(int i= 0; i < n; i++){
            sum += arr[i];
        }

        if(diff > sum || (diff + sum) % 2 != 0) return 0;

        sum =  (diff + sum)/2;

        int[][] t = new int[n + 1][sum + 1];

        for(int j = 0; j < sum + 1; j++){
            t[0][j] = 0;
        }
        for(int i = 0; i < n + 1; i++){
            t[i][0] = 1;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < sum + 1; j++){
                if(arr[i - 1] <= j){
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                }
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
}
