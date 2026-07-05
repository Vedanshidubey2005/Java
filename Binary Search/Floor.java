import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
    int[] arr= {-13,-4,-1,3,5,45,67,88,99};
    System.out.println("Enter the number u want to search");
    int target = in.nextInt();
    int ans = floor1(arr, target);
    System.out.println("index : "+ ans);
}
    static int floor1(int[] arr, int target) {
         int start =0;
         int end = arr.length -1;
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
         return end;
//  Enter the number u want to search
// 44
// index : 4
    }
}
