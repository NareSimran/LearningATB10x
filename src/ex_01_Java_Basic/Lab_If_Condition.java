package ex_01_Java_Basic;

public class Lab_If_Condition {
    public static void main(String[] args) {
       // int age=19;
        int age=Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("You are allowed to vote!");
        }
    }
}
