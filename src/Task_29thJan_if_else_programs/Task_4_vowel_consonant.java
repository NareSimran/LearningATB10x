package Task_29thJan_if_else_programs;

import java.util.Scanner;

public class Task_4_vowel_consonant {
    public static void main(String[] args) {
        //Check if a Character is a Vowel or Consonant
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        ch = sc.next();
        for (int i = 0; i < ch.length(); i++) {


            if (ch.charAt(i) == 'a' || ch.charAt(i) == 'e' || ch.charAt(i) == 'i' || ch.charAt(i) == 'o' || ch.charAt(i) == 'u') {
                System.out.println(ch.charAt(i) +  " is vowel");
            } else {
                {
                    System.out.println(ch.charAt(i) + " is consonant");
                }

            }

        }
    }
}
