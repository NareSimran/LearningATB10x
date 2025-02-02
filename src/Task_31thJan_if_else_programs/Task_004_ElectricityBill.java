package Task_31thJan_if_else_programs;

import java.util.Scanner;

public class Task_004_ElectricityBill {
    public static void main(String[] args) {
// Electricity Bill Calculation (Based on Units Consumed)
//take the input from the user of Units.
//Implement Rate Structure:
//Define the rate structure for calculating the bill based on the number of units consumed.
//First 100 units: 0.50Rs per unit
//Next 100 units (101-200): 0.75Rs per unit
// Next 100 units (201-300): 1.20Rs per unit
//:- Above 300 units: 1.50Rs per unit
        double electricityBi=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of units");
        int unit=sc.nextInt();
        if(unit>0&&unit<=100){
           double electricityBill=0.50*unit;
            System.out.println("Electricity bill is :"+electricityBill);
        } else if (unit>=101&& unit<=200) {
            double electricityBill=0.75*unit;
            System.out.println("Electricity bill is :"+electricityBill);
        }
        else if (unit>=201&& unit<=300) {
            double electricityBill=1.20*unit;
            System.out.println("Electricity bill is :"+electricityBill);
        }
        else {
            double electricityBill=1.50*unit;
            System.out.println("Electricity bill is :"+electricityBill);
        }

    }
}
