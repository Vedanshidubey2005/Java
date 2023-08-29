import java.util.Scanner;  
public class first {
       public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area; 
       if( radius==0 || radius<0){
        System.out.println("Enter non zero positive number");
        return;
          }
                           
        perimeter = 2 * Math.PI * radius;
         area = Math.PI * radius * radius;
         System.out.println( perimeter);
         System.out.print( area);
                        }
                    }
