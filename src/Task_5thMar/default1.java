package Task_5thMar;

public class default1 {

  hello hq=new hello();

}

class hello{
    // Default (package-private) variable - Accessible only within the same package
    String message = "This is a default access modifier variable!";

    // Default (package-private) method - Accessible only within the same package
    void displayMessage() {
        System.out.println(message);
    }
}
