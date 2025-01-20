package ex_01_Java_Basic;

import java.sql.SQLOutput;

public class Lab_TernaryOp_Largest {
    public static void main(String[] args) {

        //Finding the Largest of Three Numbers a,b,c using the Ternary Operator
        int n1=69,n2=139,n3=49;
        int largest=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("The largest no is :"+largest);

    }
}
