package Task_01_Feb_programs;
import java.util.Scanner;
public class Task_002_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days");
        double days = sc.nextDouble();

        double years = days / 365;
        double DaysAfterYearsRemaining = days % 365;
        double months = DaysAfterYearsRemaining / 30;
        double daysRemaining = DaysAfterYearsRemaining % 30;

        System.out.println(days + "Days is equals to : " + years + " years, " + months + " months, and " + days + " days.");

    }
}
