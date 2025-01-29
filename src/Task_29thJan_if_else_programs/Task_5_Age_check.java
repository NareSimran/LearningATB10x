package Task_29thJan_if_else_programs;

import java.util.Scanner;

public class Task_5_Age_check {
    //Check if a Person is Eligible to Vote (Age Check)
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of person");
        age=sc.nextInt();

        if(age>=18){
            System.out.println("Person can vote as their age is "+age);
        }
        else

            System.out.println("Person cannot vote because their age is "+age);
        }

    }

