package Task_02Feb_StringFunctions;

import java.util.Arrays;

public class Task_001 {
    public static void main(String[] args) {
       //str and str1 are created in SCP
        String str="HelloWorld";
        String str1="HelloWorld";
        String str3=new String("HelloWorld");//Created in OA/Heap Area

        System.out.println(str == str1);  // true, both refer to the same object in the string pool
        System.out.println(str == str3);  // false, str is in SCP whereas str3 is a new object in the heap
        System.out.println(str.equals(str3));  // true, because the content is the same

        String name="Simran";
        String name1="Nare";

        // 1. charAt()
        System.out.println(name.charAt(2));

        // 2. concat()
        System.out.println(name.concat(" Nare"));

        // 3. contains()
        System.out.println(name.contains("Simran"));

        // 4. equals()
        System.out.println(name.equals("Simran"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("simran"));

        // 6. indexOf()
        System.out.println(name.indexOf('n'));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 9. split()

        String name4 = "Simran Shree";
        String[] split = name4.split(" ");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]);
        System.out.println(split[1]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("Simran".toLowerCase());

        // 12. toUpperCase()
        System.out.println("simran".toUpperCase());

        // 13. replaceAll()
        System.out.println(name1.replaceAll(" ", " Shree "));

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("e"));

        // 16. isEmpty()
        System.out.println(name.isEmpty());

        // 17. trim()
        String name3 = "    Simran Shree     ";
        System.out.println(name3.trim());

        // 18. compareTo()
        System.out.println(name.compareTo("Simran"));

        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("simran"));

        // 20. lastIndexOf()
        System.out.println(name.lastIndexOf("a"));

        // 21. repeat()
        System.out.println(name.repeat(2));

        StringBuilder stringBuilder = new StringBuilder("Simran");
        stringBuilder.append("Nare");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Hey");
        sb.append(" Welcome to my World!");
        System.out.println(sb.toString());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);


    }
}
