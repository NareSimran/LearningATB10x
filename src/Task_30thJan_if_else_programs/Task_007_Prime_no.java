package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_007_Prime_no {
    public static void main(String[] args) {
        // Check if a Number is Prime

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }

        public static boolean isPrime ( int num){
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
          return true;
        }
    }
