package mypackage;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int number=sc.nextInt();

    if(number%2==0){
        System.out.println( " is even");
    }
    else{
        System.out.println( " is odd");
    }

    }
}
