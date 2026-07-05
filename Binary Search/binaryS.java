import java.util.Scanner;
public class binaryS {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr= {-13,-4,-1,3,5,45,67,88,99};
    System.out.println("Enter the number u want to search");
    int target = in.nextInt();
    // int ans = binary1(arr,target);
    // System.out.println( "index:" +ans);
    int ans = orderAgnostic(arr,target);
    System.out.println("index"+ ans);
}

    //  static int binary1(int[] arr, int target) {
    //      int start =0;
    //      int end = arr.length -1;
    //      while(start<= end){
    //         int mid = start + (end - start)/2;
    //         if(arr[mid] >  target){
    //             end= mid-1;
    //         }
    //         else if(arr[mid]< target){
    //             start = mid +1;
    //         }
    //         else{
    //             return mid;
    //         }
    //      }
    //      return -1;
// Enter the number u want to search
// 99
// //index:8
  //  }
   
  //order agnostic BS
    static int orderAgnostic(int[] arr, int target){
        int start =0;
         int end = arr.length -1;
        boolean asc = arr[start]< arr[end];
         while(start<= end){
            int mid = start + (end - start)/2;

            if(arr[mid]== target)
                 return mid;
            if(asc){
            if(arr[mid] >  target){
                end= mid-1;
            }
            else {
                start = mid +1;
            }
        }
        else{
            if(arr[mid] >  target){
                
                start = mid +1;
            }
            else {
                end= mid-1;
            }
        }
         }
         return -1;
    }
}
