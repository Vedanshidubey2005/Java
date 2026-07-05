 import java.util.Scanner;

public class ceil {
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
    int[] arr= {-13,-4,-1,3,5,45,67,88,99};
    System.out.println("Enter the number u want to search");
    int target = in.nextInt();
    int ans = ceil1(arr, target);
    System.out.println("index : "+ ans);
}
    static int ceil1(int[] arr, int target) {
         int start =0;
         int end = arr.length -1;
         if( target > arr[end]) return -1;
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
         return start;
// Enter the number u want to search
// 44
// index : 5
    }
}


