import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        String name = "Ved";
        String lastname = " Dubey";
        String sentence = "My name is Ved Dubey";
        // System.out.println(name);        //Ved
        // System.out.println(fullname);   //Ved Dubey
        // System.out.println(sentence);  //My name is Ved Dubey
        // Scanner sc = new Scanner(System.in);
        // // String name1 = sc.next();
        // String name1 = sc.nextLine();
        // System.out.println("My name is "+ name1);
            //String methods
        // String fullname = name+lastname;
        // System.out.println("My name is "+ fullname);
        // System.out.println( fullname.length());    //length method
        // for(int i=0;i<fullname.length();i++){
        // System.out.println(fullname.charAt(i));  //CharAt()method to print all, characters
        String na = "Tina";
        String nam = "Tina";
        // if(na.compareTo(nam) == 0){              //string1compareTo(string2);
        //       System.out.println("equal");
        // }
        // else{
        //       System.out.println(" not equal");
        // }
        //  if(na== nam){                      // == fails at most of the places
        //       System.out.println("equal");
        // }
        // else{
        //       System.out.println(" not equal");
        // }
        // if(new String("Diya")==new String("Diya")){                      // here gives wrong answer
        //       System.out.println("equal");
        // }
        // else{
        //       System.out.println(" not equal");
        // }
                                 //SUBSTRING
        String gyaan ="Love Conquers All";
        String sub = gyaan.substring(5,gyaan.length());
        System.out.println(sub);
        }
    }
    

