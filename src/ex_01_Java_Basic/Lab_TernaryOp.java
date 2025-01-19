package ex_01_Java_Basic;

public class Lab_TernaryOp {
    public static void main(String[] args) {
        int marks=91;
        String Grade=
                (marks>=90&&marks<=100)?"A":
                        (marks>=80&&marks<=89)?"B":
                                (marks>=70&&marks<=79)?"C":
                                        (marks>=60&&marks<=69)?"D":
                                                (marks>=0 &&marks<=60)?"F":"Invalid marks";

        System.out.println("The student grade is :"+Grade);
    }

}
