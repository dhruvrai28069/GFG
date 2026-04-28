public class TowerofHanoi {

    public int towerOfHanoi(int n, int from, int to, int aux) {

        if(n == 1) return 1;
        int left = towerOfHanoi(n-1, from, aux, to);
        int curr = 1;
        int right = towerOfHanoi(n-1, aux, from, to);

        return left + curr + right;
    }
}
