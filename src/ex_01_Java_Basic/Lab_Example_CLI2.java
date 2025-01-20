package ex_01_Java_Basic;

public class Lab_Example_CLI2 {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        String no=args[0];
        String no1=args[1];
        int number1=Integer.parseInt(no);
        int number2=Integer.parseInt(no1);

        int max=number1>number2?number1:number2;
        System.out.println("The maximum no is :"+max);

    }
}
