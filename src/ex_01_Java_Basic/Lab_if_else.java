package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        //NEW -KEYWORD
        //Scanner-class
        //nextint-method
        if(age>18){
            System.out.println("You are allowed to vote!");
        }
        else
        {
            System.out.println("Not allowed");
        }

    }
}
