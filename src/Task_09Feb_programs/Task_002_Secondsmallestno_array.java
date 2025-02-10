package Task_09Feb_programs;

import java.util.Arrays;

public class Task_002_Secondsmallestno_array {
    public static void main(String[] args) {
        int[]array={19, 39, 11, 1, 100, 3, 4, 42};
        Arrays.sort(array);
        System.out.println("Second largest number in array = "+array[1]);
    }
}
