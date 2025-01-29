package Task_29thJan_if_else_programs;

import java.util.Scanner;

public class Task_3_maxof2nos {
    public static void main(String[] args) {
        //Find the Maximum of Two Numbers
        int num1=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        if(sc.hasNextInt()){
            num1= sc.nextInt();
        }
        else {
            System.out.println("Enter int only");
            System.exit(0);
        }

        System.out.println("Enter the num 2");
        int num2 = 0;
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();
        } else {
            System.out.println("Enter only int ");
            System.exit(0);

        }



        if(num1>num2){
            System.out.println("Number1 is maximum:"+num1);
        }
        else if(num2>num1)
        {
            System.out.println("Number2 is maximum:"+num2);
        }
        else if(num1==num2)
        {
            System.out.println("both are equal");
        }
        else {
            System.out.println("Not a valid entry");
        }
    }
}
