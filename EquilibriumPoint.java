public class EquilibriumPoint {

    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        if (n == 0) return -1;

        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (prefix[i] == suffix[i]) {
                return i;
            }
        }
        return -1;
    }
    static void main(String[] args) {

        int[] input1 = {-7, 1, 5, 2, -4, 3, 0};

        int[] input2 = {1, 2, 3};

        int result1 = findEquilibrium(input1);
        int result2 = findEquilibrium(input2);

        System.out.println("Test Case 1 Equilibrium Index: " + result1);
        System.out.println("Test Case 2 Equilibrium Index: " + result2);
    }
}