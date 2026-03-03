public class Floor_in_a_Sorted_Array {

    public int findFloor(int[] arr, int x) {

        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low  <= high){

            int mid = low + (high - low)/2;

            if(x == arr[mid]){
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}
