package Task_07Feb_programs;

import java.util.Scanner;

public class Task_003_multiplication_table {
    public static void main(String[] args) {
        //Multiplication Table of a Given Number (take the input from user).

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();


        int Product;
        for(int i=1;i<=10;i++){
            Product=num*i;
            System.out.println(num + "*" + i + "=" +Product);
        }
    }
}
