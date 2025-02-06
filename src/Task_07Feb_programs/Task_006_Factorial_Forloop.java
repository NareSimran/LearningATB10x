package Task_07Feb_programs;

import java.util.Scanner;

public class Task_006_Factorial_Forloop {
    //Factorial of a Number
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=0;
        num=sc.nextInt();

        for(int i=(num-1);i>0;i--)
        {
            num = num * i;
        }
        System.out.println("Factorial is:"+num);

    }
}
