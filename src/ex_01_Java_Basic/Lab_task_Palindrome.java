package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_task_Palindrome {
    //  //Palindrome of String-madam->madam
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to check palindrome ");
        String word=sc.next();
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
           reverse =reverse+word.charAt(i);
        }
        if(word.equals(reverse))
        {
            System.out.println("the name has palindrome is :"+reverse);
        }
        else {
            System.out.println("The name doesnt has palindrome:"+reverse);
        }
    }


}
