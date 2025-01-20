package ex_01_Java_Basic;

public class Lab_CLI_Examples {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        String name=args[0];

        String age1=args[1];
        int age=Integer.parseInt(age1);

        String Salary2=args[2];
        int salary=Integer.parseInt(Salary2);

        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Salary is "+salary);
    }
}
