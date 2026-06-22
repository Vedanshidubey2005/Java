import java.util.Scanner;
class Methods{
    public static void main(String[] args) {
    //    // sum(); no return type
    //    int ans = sum();
    //    System.out.println("ans is :" + ans);
    Scanner in  = new Scanner(System.in);
    int a = in.nextInt();
    //System.out.println(isPrime(a));
    System.out.println(isArmstrong(a));
    }

    //Q1
// static boolean isPrime(int n){
//   if(n <=1){
//     return false;
//   }
//   int i =2;
//   while(i*i <= n){
//     if(n %i == 0){
//         return false;
//     }
//     i++;
//   }
//   if( i*i > n){
//     return true;
//   }
//   return false;
//}
//Q2
  //  static void  sum(){
        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int result = a+b;
        // System.out.println("result i :"+ result);
//         56 4567
// result i :4623
   // }
   // static int sum(){
//         Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         int result = a+b;
//         return result;
// // 345 2
// // ans is :347
//  }
//Q3
static boolean isArmstrong(int n){
    int temp = n;
    int sum =0;
    while(n>0){
        int rem = n%10;
        n= n/10;
        sum = sum + rem*rem*rem;

    }
    if(sum ==  temp){
        return true;
    }
    return false;
}

}