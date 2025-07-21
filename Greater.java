package mypackage;
import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number1");
    int a=sc.nextInt();
    System.out.println("Enter a number2");
    int b=sc.nextInt();

    if(a==b){
        System.out.println("Both numbers are equal");
    }

    else if(a>b){
        System.out.println("Number1 is greater");
   }
   else{
    System.out.println("Number2 is greater");
   }

    }
}
