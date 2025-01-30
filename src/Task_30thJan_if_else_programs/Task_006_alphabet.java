package Task_30thJan_if_else_programs;

import java.util.Scanner;

public class Task_006_alphabet {
    public static void main(String[] args) {
        //Check if a Character is an Alphabet

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);

        if (ch>='a' && ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println("This is alphabet:"+ch);
        }
        else {
            System.out.println("This is not alphabet:"+ch);
        }
    }
}
