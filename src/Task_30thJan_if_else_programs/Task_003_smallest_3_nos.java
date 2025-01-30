package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_003_smallest_3_nos {
    //Find the Smallest of Three Numbers
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();
        System.out.println("Enter number2");
        num2=sc.nextInt();
        System.out.println("Enter number3");
        num3=sc.nextInt();

        if(num1<=num2 &&num1<=num3){
            System.out.println("Smallest number is :"+num1);
        } else if (num2<=num1 &&num2<=num3) {
            System.out.println("Smallest number is :"+num2);

        }
        else {
            System.out.println("Smallest number is :"+num3);
        }

    }
}
