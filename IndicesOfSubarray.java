import java.util.ArrayList;
import java.util.HashMap;

public class IndicesOfSubarray {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Long, Integer> map = new HashMap<>();
        long prefix = 0;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];

            if (prefix == target) {
                list.add(1);
                list.add(i + 1);
                return list;
            }

            long rem = prefix - target;
            if (map.containsKey(rem)) {
                list.add(map.get(rem) + 2);
                list.add(i + 1);
                return list;
            }

            map.put(prefix, i);
        }

        list.add(-1);
        return list;
    }

     static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        System.out.println("--- Test Case 1 ---");
        System.out.println("Array: {1, 2, 3, 7, 5}");
        System.out.println("Target: " + target);

        ArrayList<Integer> result = IndicesOfSubarray.subarraySum(arr, target);

        System.out.println("Result Indices: " + result);


        System.out.println("\n--- Test Case 2 ---");
        int[] arr2 = {1, 2, 3};
        int target2 = 10;
        System.out.println("Array: {1, 2, 3}");
        System.out.println("Target: " + target2);

        ArrayList<Integer> result2 = IndicesOfSubarray.subarraySum(arr2, target2);
        System.out.println("Result Indices: " + result2);
    }
}