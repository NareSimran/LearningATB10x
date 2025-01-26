package ex_01_Java_Basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_task2_vowel_consonant {
    public static void main(String[] args) {

        //Count vowels and consonants in a String.  -pramod, → vowels - 2,
                // constants - 4
        Scanner sc=new Scanner(System.in);
        System.out.println("enter person's name");
        String wrd=sc.next();
        int vowel=0;
        int conso=0;

        for(int i=0;i<wrd.length();i++)
        {
            if(wrd.charAt(i)=='a'||wrd.charAt(i)=='e'||wrd.charAt(i)=='i'||wrd.charAt(i)=='o'||wrd.charAt(i)=='u')
            {

    vowel++;
            }
            else
            {
                conso++;
            }

        }
        System.out.println("The count of vowel is :"+vowel);
        System.out.println("The count of Consonant is :"+conso);
    }
}
