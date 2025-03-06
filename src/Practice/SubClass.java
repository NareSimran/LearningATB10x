package Practice;

import Task_5thMar.BaseClass;

public class SubClass extends BaseClass {
    public void showMessage() {
        // Accessing protected variable and method from the superclass
        System.out.println("Accessing from SubClass:");
        System.out.println("Protected variable: " + message);  // message is protected
        displayMessage();  // displayMessage() is protected
    }
}


