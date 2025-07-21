package mypackage;

import java.util.Scanner;
public class If {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age=sc.nextInt();

    if(age>18){
        System.out.println("You are a adult");
    }
    else{
        System.out.println("You are a child");
    }
}
}
