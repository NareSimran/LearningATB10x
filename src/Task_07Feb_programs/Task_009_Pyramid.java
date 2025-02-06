package Task_07Feb_programs;

public class Task_009_Pyramid {
    public static void main(String[] args) {

        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}