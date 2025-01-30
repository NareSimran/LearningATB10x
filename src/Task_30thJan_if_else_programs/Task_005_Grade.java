package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_005_Grade {
    //Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
    //1️⃣ Take user input for marks (Use Scanner class).
    //2️⃣ Check the validity of marks (ensure they are between 0 and 100).
    //3️⃣ Use if-else-if conditions to determine the grade based on marks.
    //4️⃣ Display the grade as output.
    //📌 Grading Criteria (Example)
    //Marks Range Grade
    //90 - 100   A+
    //80 - 89     A
    //70 - 79      B
    //60 - 69     C
    //50 - 59      D
    //40 - 49      E
    //Below 40   Fail
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
       int marks=sc.nextInt();
       //to check that marks should be between 0-100
        if(marks <0 || marks >100){
            System.out.println("please enter the Marks between 0 to 100 ");
        }

           else if(marks>=90 &&marks<=100){
                System.out.println("Grade is A+ ");
            }
           else if (marks>=80 &&marks<=89) {
                System.out.println("Grade is A ");
            }
            else if (marks>=70 &&marks<=79) {
                System.out.println("Grade is B ");
            }
            else if (marks>=60 &&marks<=69) {
                System.out.println("Grade is C ");
            }
            else if (marks>=50 &&marks<=59) {
                System.out.println("Grade is D ");
            }
            else if (marks>=40 &&marks<=49) {
                System.out.println("Grade is E");
            }
            else {
                System.out.println("fail");
            }
        }
    }

