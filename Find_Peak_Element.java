class Solution {
    public int findPeakElement(int[] arr){
        int n = arr.length;
        int lb=0,ub=arr.length-1,mid=0;
        if(arr.length == 1)
            return 0;
        if(arr[0] > arr[1])
            return 0;
        if(arr[n-2] < arr[n-1])
            return n-1;
        while(lb <= ub){
            mid = (lb + ub)/2;
            if(mid - 1 >= 0 && arr[mid] > arr[mid-1] && mid+1 < n && arr[mid] > arr[mid+1])
                break;
            else if(mid - 1 >= 0 && arr[mid] < arr[mid-1])
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        return mid;
    }
}
