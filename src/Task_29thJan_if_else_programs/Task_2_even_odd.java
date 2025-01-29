package Task_29thJan_if_else_programs;

import java.util.Scanner;

public class Task_2_even_odd {
    public static void main(String[] args) {
        //Check if a Number is Even or Odd
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Entered number is even:"+num);

        }
        else{
            System.out.println("Entered number is odd:"+num);
        }
    }
}
