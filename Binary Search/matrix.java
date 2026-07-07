import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int[][] arr11= {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {26, 36, 46, 50},
            {29, 39, 49, 59}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter target");
        int target = in.nextInt();
       // System.out.println("index : "+ search(arr, target));
       int[] ans = search(arr11, target);
       System.out.println(Arrays.toString(ans));
    }
   static int[] search(int[][] arr, int target){
    int row =0;
    int col = arr.length -1 ;
    while(row < arr.length && col >=0){
        if(arr[row][col] == target){
            return new int[]{row, col};
        }
        if(arr[row][col] < target){
            row++;
        }
        else{
            col--;
        }
    }
    return new int[]{-1,-1};
   }
// Enter target
// 45
// [1, 3]
}
