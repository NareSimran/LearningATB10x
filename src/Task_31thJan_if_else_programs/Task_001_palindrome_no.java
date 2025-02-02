package Task_31thJan_if_else_programs;

import java.util.Scanner;

public class Task_001_palindrome_no {
    //Check if a Number is a Palindrome
    public static void main(String[] args) {

        String st;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        st=sc.next();
        String reverse_str="";
        for(int i=0;i<st.length();i++)
        {
            reverse_str=st.charAt(i)+reverse_str;
        }
        System.out.println(reverse_str);
        if(st.equals(reverse_str))
        {
            System.out.println("No is a palindrome");
        }
        else
        {
            System.out.println("No is not a palindrome");
        }

    }
}
