package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_002_Smallest_of_Two_Numbers {
    //Find the Smallest of Two Numbers.
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();
        System.out.println("Enter number2");
        num2=sc.nextInt();
        if(num1<num2){
            System.out.println("Smallest is :"+num1);
        }
      else{
            System.out.println("Smallest is " +
                    ":"+num2);
        }

    }
}
