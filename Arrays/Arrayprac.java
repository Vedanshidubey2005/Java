 import java.util.Arrays;
import java.util.Scanner;
public class Arrayprac {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     // declaration
       int[] arr = new int[5]; 
     //  arr[2]=43;
     //  System.out.println(arr[2]);//43
    // System.out.println(arr[0]);  //0
    //  String[] arr = new String[4];
    // System.out.println(arr[0]);  //null
    //printing using for loops
    for(int i =0;i<arr.length; i++){
        arr[i] = in.nextInt();
    }
    //  for(int i =0;i< arr.length; i++){
    //     System.out.println(arr[i] + "  ");
    // }
//    for (int num : arr) {
// System.out.println(num);   //num represnts element of aaray
//    }
System.out.println(Arrays.toString(arr));

    }
}
