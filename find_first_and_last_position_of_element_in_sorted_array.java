class Solution{
    int startingValue = 9999999, endingValue = -1;
    public void func(int lb, int ub, int arr[], int target){
        if(lb > ub)
            return;
        
        int mid;
        
        while(lb <= ub){
            mid = lb + (ub - lb)/2;
            if(arr[mid] < target)
                lb = mid + 1;
            else if(arr[mid] > target)
                ub = mid - 1;
            else{
                startingValue = Math.min(startingValue, mid);
                endingValue = Math.max(endingValue, mid);
                func(lb, mid - 1, arr, target);
                func(mid + 1, ub, arr, target);
                break;
            }
        }
    }
    public int[] searchRange(int[] arr, int target){
        func(0, arr.length-1, arr, target);
        if(startingValue == 9999999)
            return new int[]{-1, -1};
        return new int[]{startingValue, endingValue};
    }
}
