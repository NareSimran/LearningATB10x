package Task_5thMar;

public class public_accessmodifier {
    public String message = "Hello, this is a public variable!";

    // Public method - Accessible from anywhere
    public void displayMessage() {
        System.out.println(message);
    }
}

class Hello{
    public static void main(String[] args) {
        public_accessmodifier p= new public_accessmodifier();
        System.out.println(p.message);  // Accessible because it's public
        p.displayMessage();
    }
}

