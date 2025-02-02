package Task_31thJan_if_else_programs;

import java.util.Scanner;

public class Task_003_Eligible_for_loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter creditScrore:");
        int creditScrore = sc.nextInt();
        if (age >= 18 && age <= 80  && salary >= 30000 && creditScrore >= 650 && creditScrore <= 850) {
            System.out.println("You are eligible loan, enjoy!");
        }
        else {
            System.out.println("loan cannot be passed because one or more conditions are not met: " +
                    (age < 18 || age > 80 ? "age should be between 18 and 80, " : "") +
                    (salary < 30000 ? "salary should be greater than " + 30000 + ", " : "") +
                    (creditScrore < 650 || creditScrore > 850 ? "Credit score should be between " + 650 + " and " + 850 : ""));
        }
        sc.close();
    }
}