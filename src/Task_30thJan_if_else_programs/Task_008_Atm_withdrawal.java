package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_008_Atm_withdrawal {
    public static void main(String[] args) {
        int account_balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int amount = sc.nextInt();
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount should be multiple of 100");
        } else if (amount>account_balance) {
            System.out.println("Amount cannot be greater than account balance");
            
        }
        else {
            account_balance=account_balance-amount;
            System.out.println("The Updated account balance is :"+account_balance);
        }
    }
}
