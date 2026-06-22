import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextInt();//5
        // System.out.println(num); //5.0
        // float num1 = input.nextFloat(); //4
        // System.out.println(num1); //4.0
    //int num1 = input.nextFloat();  error

   //type casting - compressing the bigger number into smaller type explicitly
  // int num2 = 67.342; error
  int num2 = (int) (67.342f);
  System.out.println(num2); //67
  //automatic type promotions in expressions
    int a = 257;
    byte b = (byte)(a);
   // System.out.println(b);  //1   257%256
    // byte x = 40;
    // byte y = 50;
    // byte z = 100;
    // int d = x*y / z;
    // System.out.println(d);   //20 automatic type promotion
    // byte bi = 48;
    // char c = 'k';
    // short s = 379;
    // int i  = 3400;
    // float f = 0.34f;
    // double d = 787.333;
    // double result = (f * b) + (i / c) - (d - s);
    //  System.out.println((f * b) + " " + (i / c) + " " + (d - s));
     System.out.println(result);  
    }
}
