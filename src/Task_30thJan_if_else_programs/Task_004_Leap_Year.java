package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_004_Leap_Year {
    //Check if a Year is a Leap Year
    public static void main(String[] args) {

        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year");
        year=sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("It is a leap year:"+year);
        }
        else {
            System.out.println("It is not leap year");
        }


    }
}
