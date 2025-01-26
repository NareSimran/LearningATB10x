package ex_01_Java_Basic;

public class Lab_task25Jan {
    public static void main(String[] args) {
        for (int no=1;no<=100;no++){
            if (no%3==0){
                System.out.println("Fizz");
            }
            else if(no%5==0){
                System.out.println("Buzz");

            }
            else if (no%3==0 && no%5==0){
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(no);
            }
        }
    }
}
