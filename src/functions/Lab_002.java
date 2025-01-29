package functions;

import java.util.Scanner;

public class Lab_002 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no");
        int a=0;
        if(sc.hasNextInt()){
             a=sc.nextInt();
        }
        else
        {
            System.out.println("Enter int nos only");
        }
        System.out.println("Enter the 2nd no");
        int b=sc.nextInt();
        int sum_result=sum(a,b);
        int sub_result=sub(a,b);
        int mul_result=mul(a,b);
        int div_result=div(a,b);
        int mod_result=mod(a,b);
        System.out.println("Sum is :"+sum_result);
        System.out.println("Sub is :"+sub_result);
        System.out.println("mULT is :"+mul_result);
        System.out.println("Div is :"+div_result);
        System.out.println("Mod is :"+mod_result);




    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
    static int mod(int a,int b){
        return a%b;
    }
}
