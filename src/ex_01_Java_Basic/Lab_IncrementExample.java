package ex_01_Java_Basic;

public class Lab_IncrementExample {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);
       //11+11+12=34
        System.out.println(a);
        //13
    }
}
