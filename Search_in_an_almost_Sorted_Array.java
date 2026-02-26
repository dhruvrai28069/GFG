public class Search_in_an_almost_Sorted_Array {

    public int findTarget(int arr[], int target) {

        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(mid > 0 && target == arr[mid-1]){
                return mid-1;
            }
            if(mid < n-1 && target == arr[mid+1]){
                return mid+1;
            }
            else if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}