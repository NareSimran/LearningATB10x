package Task_29thJan_if_else_programs;

import java.util.Scanner;

public class Task_1_positive_negative_no {

    //Check if a Number is Positive or Negative.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = 0;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        }
        else {
            System.out.println("Enter only int number ");
            System.exit(0);
        }

         if(num>0){
             System.out.println("Number is positive:"+num);
         } else if (num<0) {
             System.out.println("Number is negative:"+num);

         } else if (num==0) {
             System.out.println("Number is zero");
             
         }
        else {
             System.out.println("It is not valid num");
         }


    }
}
