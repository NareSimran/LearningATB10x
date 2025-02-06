package Task_07Feb_programs;

import java.util.Scanner;

public class Task_007_Right_angled_triangle {
    //Right-Angled Triangle
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}