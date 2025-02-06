package Task_07Feb_programs;

import java.util.Scanner;

public class Task_004_Whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int num= sc.nextInt();
      ;
        int i=num-1;
        while(i>=1)
        {

            num=num*i;
            i--;
        }
        System.out.println("Factorial is "+num);

    }

}
