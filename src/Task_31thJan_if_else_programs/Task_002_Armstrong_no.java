package Task_31thJan_if_else_programs;

import java.util.Scanner;

public class Task_002_Armstrong_no {
    //Check if a Number is an Armstrong Number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int orginalNum = num;

        int Sum_cube = 0;

        while (num > 0) {
            int digit = num % 10;
            Sum_cube = Sum_cube + (digit * digit * digit);
            num /= 10;
        }

        if (Sum_cube == orginalNum)
            System.out.println(orginalNum + " is an Armstrong number");
        else
            System.out.println(orginalNum + " is not an Armstrong number");
    }
}

