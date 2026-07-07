public class rotated {
    public static void main(String[] args) {
        //int[] arr= {4,5,6,7,0,1,2};
        int[] arr= {2,9,9,9,2};
        int target = 2;
        int ans;
     //int pivot = findpivot(arr);
     int pivot = findpivotdup(arr);
     if(pivot == -1){
        ans = binary11(arr, target, 0 , arr.length - 1);
     }
     if(arr[pivot] == target){
       ans=  pivot;
     }
     if(target > arr[0]){
        ans = binary11(arr, target, 0, pivot -1);
     }
     else{
        ans = binary11(arr, target, pivot + 1, arr.length -1);
     }
     System.out.println(ans);
    }

     static int binary11(int[] arr, int target, int start, int end) {
        
         while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >  target){
                end= mid-1;
            }
            else if(arr[mid]< target){
                start = mid +1;
            }
            else{
                return mid;
            }
         }
         return -1;
}
    static int findpivot(int[] arr){
         int start =0;
         int end = arr.length -1;
         while(start<= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] >  arr[mid +1 ]){
                return mid;
            }
            if( mid > start && arr[mid]< arr[mid-1]){
              return mid;
            }
            if(arr[start]>= arr[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
         }
         return -1;
    }

    static int findpivotdup(int[] arr){
         int start =0;
         int end = arr.length -1;
         while(start<= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] >  arr[mid +1 ]){
                return mid;
            }
            if( mid > start && arr[mid]< arr[mid-1]){
              return mid;
            }
            //if start=end =mid
            if(arr[mid]== arr[start] && arr[mid] == arr[end]){
                //check if start / end are mot pivot
                if(arr[start]> arr[start +1]){
                    return start;
                }
                start++;
                if(arr[end]< arr[end-1]){
                    return mid-1;
                }
                end--;
            }
            else if(arr[start]< arr[mid] || arr[start]==arr[mid]&& arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
         }
         return -1;
    }
}
